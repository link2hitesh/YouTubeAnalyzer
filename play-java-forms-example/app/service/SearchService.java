package service;

import javax.inject.Inject;

import java.util.concurrent.CompletionStage;
import java.util.*;
import service.*;

/**
 * @author Adeyinka
 * API to search the list of videos to be displayed on the main page.
 */
public class SearchService {

    @Inject private YoutubeServiceApi  serviceImpl;


    public CompletionStage<List<String>> search(final String word) {
        return serviceImpl.search(word);
    }
}
