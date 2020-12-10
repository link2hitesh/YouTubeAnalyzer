package actors;
/**
 * This class is used for setting up the protocol
 * @author Ankur Aggarwal
 */
public class SimillarProtocol {

    /**
     * This class set the name as the message received from the method calling actor
     */
    public static class SayHello2 {
        public final String name ;

        /**
         * constructor for the class
         */
        public SayHello2(String name) {
            this.name = name;
        }

    }
}
