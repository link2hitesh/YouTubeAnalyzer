package actors;


import actors.*;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.testkit.javadsl.TestKit;
import models.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import java.util.ArrayList;


/**
 * This test was written to test the SimilarActorClass.
 * @author adeyinka
 */

public class SimilarActorTest {

    static ActorSystem system;
    static SimillarProtocol.SayHello2 testService;


    @BeforeClass
    public static void setup() {
        system = ActorSystem.create();
        testService = new SimillarProtocol.SayHello2("TestWidgets");

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
                final Props props = Props.create(SimillarActor.class);
                final ActorRef subject = system.actorOf(props);
                final TestKit probe = new TestKit(system);
                subject.tell(testService, probe.getRef());
                probe.expectMsgClass(ArrayList.class);

            }
        };
    }


}
