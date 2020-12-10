package actors;

import akka.actor.AbstractActorWithTimers;
import akka.actor.ActorRef;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import models.*;
import service.*;

import scala.concurrent.duration.Duration;


import javax.inject.Inject;
import java.util.HashSet;
import java.util.*;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;
/**
 * the actor class for the youtube search fields
 * @author Adeyinka
 *
 */


public class SearchResultsActor extends AbstractActorWithTimers {

    @Inject
    private YoutubeServiceApi apiService;

    private ActorRef userActor;

    private String query;

    private final LoggingAdapter logger = Logging.getLogger(getContext().system(), this);


    private SearchValues results;


    public static final class Tick {
    }

    /**
     * Start the time, create a Tick every 5 seconds
     */
    @Override
    public void preStart() {
        getTimers().startPeriodicTimer("Timer", new Tick(),
                Duration.create(5, TimeUnit.SECONDS));
    }

    /**
     *
     * Constructor
     */
    public SearchResultsActor() {
        this.userActor = null;
        this.query = null;
        this.results = new SearchValues();
    }

    /**
     * Handle the incoming messages
     * @return Receive receive
     */
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(Messages.RegisterActor.class, message -> {
                    logger.info("Registering actor {}", message);
                    userActor = sender();
                    getSender().tell("UserActor registered", getSelf());
                })
                .match(Tick.class, message -> {
                    logger.info("Received message Tick {}", message);
                    if (query != null) {
                        tickMessage();
                    }
                })
                .match(Messages.WatchSearchResults.class, message -> {
                    logger.info("Received message WatchSearchResults {}", message);
                    if (message != null && message.query != null) {
                        watchSearchResult(message);
                    }
                })
                .build();
    }

    /**
     * watchSearchResult message handling
     * @param message message to handle
     * @return CompletionStage of Void
     */
    public CompletionStage<Void> watchSearchResult(Messages.WatchSearchResults message) {
        // Set the query
        query = message.query;

        return apiService.searchS(query).thenAcceptAsync(searchResults -> {
            // This is the first time we want to watch a (new) query: reset the list
            this.results = new SearchValues();

            // Add all the statuses to the list
            results.addAll(searchResults);

            results.list().forEach(status -> status.setSearchTerm(query));

            Messages.resultMessages statusesMessage =
                    new Messages.resultMessages(results, query);

            userActor.tell(statusesMessage, self());
        });
    }

    /**
     * watchSearchResult message handling
     * @return CompletionStage of void
     */
    public CompletionStage<Void> tickMessage() {

        return apiService.searchS(query).thenAcceptAsync(searchResults -> {
            SearchValues oldStatuses = results;
            results.addAll(searchResults);

            SearchValues newStatuses = results;

            newStatuses.removeAll(oldStatuses);

            newStatuses.list().forEach(status -> status.setSearchTerm(query));

            Messages.resultMessages statusesMessage =
                    new Messages.resultMessages(newStatuses, query);

            userActor.tell(statusesMessage, self());
        });
    }

    /**
     * Keyword getter
     * @return String query
     */
    public String getQuery() {
        return query;
    }

    /**
     * Setter for the query
     * @param query String query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * Setter for the statuses
     * @param results Set of Statuses statuses
     */
    public void setResults(SearchValues results) {
        this.results = results;
    }

    /**
     * Statuses getter
     * @return Set of Status statuses
     */
    public SearchValues getResults() {
        return results;
    }

    /**
     * Get Youtube Service
     * @return YoutubeApi
     */
    public YoutubeServiceApi getApiService() {
        return apiService;
    }

    /**
     * Set Youtube Service
     * @param apiService YoutubeService
     */
    public void setApiService(YoutubeServiceApi apiService) {
        this.apiService = apiService;
    }
}
