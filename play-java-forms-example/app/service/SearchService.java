package service;

import javax.inject.Inject;

import java.util.concurrent.CompletionStage;
import java.util.*;
import service.*;

public class SearchService {

    @Inject private YoutubeServiceApi  serviceImpl;


    public CompletionStage<List<String>> search(final String word) {
        return serviceImpl.search(word);
    }
}