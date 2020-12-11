package actors;

import actors.ChannelApi;
import actors.ChannelVideoActor;
import actors.ChannelVideoProtocol;
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
 * This test was written to test the ChannelVideoActorClass.
 * @author adeyinka
 */

public class ChannelVideoActorTest {

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
        /*
         * Wrap the whole test procedure within a testkit constructor
         * if you want to receive actor replies or use Within(), etc.
         */
        new TestKit(system) {
            {


                final Props props = Props.create(ChannelVideoActor.class);
                final ActorRef subject = system.actorOf(props);

                final TestKit probe = new TestKit(system);

                subject.tell(testService, probe.getRef());
                probe.expectMsgClass(ArrayList.class);

            }
        };
    }


}
