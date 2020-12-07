package actors;

import akka.actor.*;
import akka.japi.*;

import actors.ChannelVideoProtocol.*;

import java.util.List;


/**
 * the actor class for the owner page
 * @author Adeyinka
 *
 */

public class OwnerPageActor extends AbstractActor{

    public static Props getProps() {
        return Props.create(OwnerPageActor.class);
    }

    @Override
    public AbstractActor.Receive createReceive() {
        return receiveBuilder()
                .match(
                        SayHello.class,
                        hello -> {
                            String chanId = hello.name;
                            List<String> reply = OwnerPageApi.Search(chanId);
                            sender().tell(reply, self());
                        })
                .build();
    }


}