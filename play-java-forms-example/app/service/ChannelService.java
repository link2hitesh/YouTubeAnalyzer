package service;

import javax.inject.Inject;

import java.util.concurrent.CompletionStage;
import java.util.*;
import service.*;

/**
 * @author Adeyinka Areje
 * This is the channel service class where we have injected the YoutubeAPI.
 */

public class ChannelService {

    @Inject
    private YoutubeServiceApi serviceImpl;


    public ChannelService(){

    }

    /**
     * This method returns results of the channel id search.
     * @param chanId
     * @return
     */
    public CompletionStage<List<String>> getOwner(final String chanId) {
        return serviceImpl.search(chanId);
    }
}
