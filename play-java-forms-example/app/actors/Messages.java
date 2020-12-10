package actors;


import java.util.*;
import models.*;

import static java.util.Objects.requireNonNull;

/**
 * This class contains all the messages
 * @author Adeyinka Areje
 */

public final class Messages {

    /**
     * Create UserParentActor Message
     */
    public static final class UserParentActorCreate {
        public final String id;

        public UserParentActorCreate(String id) {
            this.id = requireNonNull(id);
        }

        @Override
        public String toString() {
            return "UserParentActorCreate(" + id + ")";
        }
    }

    /**
     * WatchSearchResults Message
     */
    public static final class WatchSearchResults {
        public final String query;

        public WatchSearchResults(String query) {
            this.query = requireNonNull(query);
        }
        /**
         * Override toString for the Messages class
         * @return message
         */
        @Override
        public String toString() {
            return "WatchSearchResults(" + query + ")";
        }
    }

    /**
     * UnwatchSearchResults Message
     */
    public static final class UnwatchSearchResults {
        public final String query;

        /**
         *  return the query
         */
        public UnwatchSearchResults(String query) {
            this.query = requireNonNull(query);
        }


        /**
         * Override toString for the Messages class
         * @return message
         */
        @Override
        public String toString() {
            return "UnwatchSearchResults(" + query + ")";
        }
    }


    public static final class resultMessages {
        public final SearchValues results;
        public final String query;

        /**
         *  return the message and query term
         */
        public resultMessages(SearchValues results, String query) {
            this.results = requireNonNull(results);
            this.query = requireNonNull(query);
        }

        /**
         * Override toString for the Messages class
         * @return message
         */

        @Override
        public String toString() {
            return "StatusesMessage(" + query + ")";
        }
    }
    /**
     * RegisterActor Message
     */

    public static final class RegisterActor {
        /**
         * Override toString for the Messages class
         * @return message
         */

        @Override
        public String toString() {
            return "RegisterActor";
        }
    }

    /**
     * Override toString for the Messages class
     * @return message
     */

    @Override
    public String toString() {
        return "Messages";
    }



}