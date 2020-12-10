package actors;

import actors.Messages.UnwatchSearchResults;
import actors.Messages.WatchSearchResults;
import akka.Done;
import akka.NotUsed;
import akka.actor.AbstractActor;
import akka.actor.Actor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.japi.Pair;
import akka.stream.KillSwitches;
import akka.stream.Materializer;
import akka.stream.UniqueKillSwitch;
import akka.stream.javadsl.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Injector;
import models.*;
import play.libs.Json;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.concurrent.CompletionStage;


public class UserActor extends AbstractActor {

    private final LoggingAdapter logger = Logging.getLogger(getContext().system(), this);

    private Map<String, UniqueKillSwitch> searchResultsMap = new HashMap<>();

    private Map<String, ActorRef> searchResultsActors;

    private Materializer mat;

    private Sink<JsonNode, NotUsed> hubSink;

    private Sink<JsonNode, CompletionStage<Done>> jsonSink;

    private Flow<JsonNode, JsonNode, NotUsed> websocketFlow;

    private Injector injector;

    /**
     * Default empty constructor for the tests
     */
    public UserActor() {
        searchResultsActors = null;
        mat = null;
        hubSink = null;
        websocketFlow = null;
        injector = null;
    }

    /**
     * Regular constructor
     * @param injector Guice Injector, used later to create the SearchResultsActor with GuiceInjectedActor
     * @param mat Materializer for the Akka streams
     */
    @Inject
    public UserActor(Injector injector, Materializer mat) {
        this.searchResultsActors = new HashMap<>();
        this.mat = mat;
        this.injector = injector;
        createSink();
    }

    /**
     * Create the Akka Sink
     */
    public void createSink() {
        Pair<Sink<JsonNode, NotUsed>, Source<JsonNode, NotUsed>> sinkSourcePair =
                MergeHub.of(JsonNode.class, 16)
                        .toMat(BroadcastHub.of(JsonNode.class, 256), Keep.both())
                        .run(mat);

        hubSink = sinkSourcePair.first();
        Source<JsonNode, NotUsed> hubSource = sinkSourcePair.second();

        jsonSink = Sink.foreach((JsonNode json) -> {
            String queryRequest = json.findPath("query").asText();
            askForStatuses(queryRequest);
        });


        this.websocketFlow = Flow.fromSinkAndSourceCoupled(jsonSink, hubSource)
                .watchTermination((n, stage) -> {
                    // Stop the searchResultsActors
                    searchResultsActors.forEach((query, actor) -> stage.thenAccept(f -> context().stop(actor)));

                    // When the flow shuts down, make sure this actor also stops.
                    stage.thenAccept(f -> context().stop(self()));

                    return NotUsed.getInstance();
                });
    }

    /**
     * If there already exists a SearchResultsActor for the keyword we want, ask it for updates
     * Otherwise, create a new one, register the UserActor and wait the results
     * @param query
     */
    private void askForStatuses(String query) {
        ActorRef actorForQuery = searchResultsActors.get(query);
        if (actorForQuery != null) {
            actorForQuery.tell(new WatchSearchResults(query), self());
        } else {
            actorForQuery = getContext().actorOf(Props.create(GuiceInjectedActor.class, injector,
                    SearchResultsActor.class));
            searchResultsActors.put(query, actorForQuery);
            actorForQuery.tell(new Messages.RegisterActor(), self());
            actorForQuery.tell(new WatchSearchResults(query), self());
        }
    }

    /**
     * The receive block, useful if other actors want to manipulate the flow.
     */
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(WatchSearchResults.class, watchSearchResults -> {
                    logger.info("Received message WatchSearchResults {}", watchSearchResults);
                    if (watchSearchResults != null) {
                        // Ask the searchResultsActors for a stream containing these searchResults
                        askForStatuses(watchSearchResults.query);
                        sender().tell(websocketFlow, self());
                    }
                })
                .match(UnwatchSearchResults.class, unwatchSearchResults -> {
                    logger.info("Received message UnwatchSearchResults {}", unwatchSearchResults);
                    if (unwatchSearchResults != null) {
                        searchResultsMap.get(unwatchSearchResults.query).shutdown();
                        searchResultsMap.remove(unwatchSearchResults.query);
                    }
                })
                .match(Messages.resultMessages.class, message -> {
                    logger.info("Received message StatusesMessage {}", message);
                    if (message != null) {
                        addStatuses(message);
                        sender().tell(websocketFlow, self());
                    }
                })
                .build();
    }

    /**
     * Adds a statuses to the hub.
     * @param message StatusesMessage message contaning the query and the statuses
     */
    public void addStatuses(Messages.resultMessages message) {
        SearchValues results = message.results;
        String query = message.query;

        logger.info("Adding results {} for query {}", results, query);

        Source<JsonNode, NotUsed> getSource = Source.from(results.list())
                .map(Json::toJson);


        final Flow<JsonNode, JsonNode, UniqueKillSwitch> killswitchFlow = Flow.of(JsonNode.class)
                .joinMat(KillSwitches.singleBidi(), Keep.right());
        // Set up a complete runnable graph from the stock source to the hub's sink
        String name = "searchresult-" + query;
        final RunnableGraph<UniqueKillSwitch> graph = getSource
                .viaMat(killswitchFlow, Keep.right())
                .to(hubSink)
                .named(name);

        // Start it up!
        UniqueKillSwitch killSwitch = graph.run(mat);

        // Pull out the kill switch so we can stop it when we want to unwatch a stock.
        searchResultsMap.put(query, killSwitch);
    }

    /**
     * Factory interface to create a UserActor from the UserParentActor
     */
    public interface Factory {
        Actor create(String id);
    }

    /**
     * Setter for Materializer
     * @param mat Materializer
     */
    public void setMat(Materializer mat) {
        this.mat = mat;
    }

    /**
     * Getter for the SearchResultsMap
     * @return a Map containing the kill switches for a query
     */
    public Map<String, UniqueKillSwitch> getSearchResultsMap() {
        return searchResultsMap;
    }

    /**
     * Setter for the SearchResultsMap
     * @param searchResultsMap SearchResultsMap
     */
    public void setSearchResultsMap(Map<String, UniqueKillSwitch> searchResultsMap) {
        this.searchResultsMap = searchResultsMap;
    }

    /**
     * Getter for the Materializer
     * @return Materializer
     */
    public Materializer getMat() {
        return mat;
    }

    /**
     * Getter for the json sink
     * @return jsonSink a Sink of JsonNodes and CompletionStage of Done
     */
    public Sink<JsonNode, CompletionStage<Done>> getJsonSink() {
        return jsonSink;
    }

    /**
     * Setter for the json sink
     * @param jsonSink Sink of JsonNode and CompletionStage of Done
     */
    public void setJsonSink(Sink<JsonNode, CompletionStage<Done>> jsonSink) {
        this.jsonSink = jsonSink;
    }

    /**
     * Getter for the SearchResultsActor map
     * @return searchResultsActors Map of String and ActorRef a map of actor references for a given query
     */
    public Map<String, ActorRef> getSearchResultsActors() {
        return searchResultsActors;
    }

    /**
     * Setter for the SearchResultsActor map
     * @param searchResultsActors Map of String and ActorRef a map of actor references for a given query
     */
    public void setSearchResultsActors(Map<String, ActorRef> searchResultsActors) {
        this.searchResultsActors = searchResultsActors;
    }
}
