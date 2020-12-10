package actors;
import akka.actor.*;
import akka.japi.*;
import models.ReturnSimilarContent;

import java.util.List;
public class SimillarActor extends AbstractActor{


    public static Props getProps() {
        return Props.create(SimillarActor.class);
    }

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
