package actors;


import actors.*;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.testkit.javadsl.TestKit;
import models.Search;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;


/**
 * This test was written to test the OwnerPageActorClass.
 * @author adeyinka
 */

public class OwnerPageActorTest {

    static ActorSystem system;
    static ChannelVideoProtocol.SayHello testService;


    @BeforeClass
    public static void setup() {
        system = ActorSystem.create();
        testService = new ChannelVideoProtocol.SayHello("UC88MUln48JnCz4VeuPmiNPQ");
    }

    @AfterClass
    public static void teardown() {
        TestKit.shutdownActorSystem(system);
        system = null;
    }


    @Test
    public void testIt() {

        new TestKit(system) {
            {
                final Props props = Props.create(OwnerPageActor.class);
                final ActorRef subject = system.actorOf(props);
                final TestKit probe = new TestKit(system);
                subject.tell(testService, probe.getRef());
                probe.expectMsgClass(ArrayList.class);

            }
        };
    }


}
