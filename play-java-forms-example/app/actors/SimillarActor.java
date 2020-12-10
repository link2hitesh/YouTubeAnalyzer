package actors;
import akka.actor.*;
import akka.japi.*;
import models.ReturnSimilarContent;

import java.util.List;


/**
 * This actor contains a set of searchResult for similarity.
 * @author Hitesh Agarwal
 */
public class SimillarActor extends AbstractActor{

    /**
     * create the actor
     * @return  actor
     */
    public static Props getProps() {
        return Props.create(SimillarActor.class);
    }
    /**
     * Handle the incoming messages
     * @return Receive receive
     */
    @Override
    public AbstractActor.Receive createReceive() {
        return receiveBuilder()
                .match(
                        SimillarProtocol.SayHello2.class,
                        hello -> {

                            ReturnSimilarContent rc = new ReturnSimilarContent();
                            List<String> reply = rc.returnSimilarContent(hello.name);

                            sender().tell(reply, self());
                        })
                .build();
    }


}
