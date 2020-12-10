package actors;


/**
 * This class is used for setting up the protocol
 * @author Ankur Aggarwal
 */
public class ChannelVideoProtocol {


    /**
     * This method set the name as the message received from the method calling actor
     */
    public static class SayHello {
        public final String name ;


        /**
         * constructor for the class
         */
        public SayHello(String name) {
            this.name = name;
        }

    }









}
