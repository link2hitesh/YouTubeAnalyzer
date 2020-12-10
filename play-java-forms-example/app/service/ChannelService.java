package service;

import javax.inject.Inject;

import java.util.concurrent.CompletionStage;
import java.util.*;
import service.*;

public class ChannelService {

    @Inject
    private YoutubeServiceApi serviceImpl;


    public ChannelService(){

    }


    public CompletionStage<List<String>> getOwner(final String chanId) {
        return serviceImpl.search(chanId);
    }
}