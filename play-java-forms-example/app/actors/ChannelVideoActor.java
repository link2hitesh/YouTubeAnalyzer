package actors;

import akka.actor.*;
import akka.japi.*;

import actors.ChannelVideoProtocol.*;
import models.channelvideolist;
import java.util.List;
/**
 * This actor contains a set of searchResults for the video of different channel
 * Inspired by class notes
 * @author Ankur Aggarwal
 */

public class ChannelVideoActor extends AbstractActor{

    /**
     * create the actor
     * @return  actor
     */

    public static Props getProps() {
        return Props.create(ChannelVideoActor.class);
    }

    /**
     * Handle the incoming messages
     * @return Receive receive
     */

    @Override
    public AbstractActor.Receive createReceive() {
        return receiveBuilder()
                .match(
                        SayHello.class,
                        hello -> {

                            String name1 = hello.name;
                            String parts[] = name1.split("//");
                            String name2 = parts[0];
                            List<channelvideolist> reply = ChannelApi.ChannelContent(name2);
                            //System.out.println(reply + "  " + reply.getClass());

                            // List<String> reply = Listwork.value(hello.name);
                            // String reply = "Hello, " + hello.name;

                            sender().tell(reply, self());
                        })
                .build();
    }


}

