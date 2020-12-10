package service;

import java.util.concurrent.CompletionStage;
import java.util.*;
import models.*;

public interface YoutubeServiceApi {

    public CompletionStage<List<String>> search(String word);
    CompletionStage<SearchValues> searchS(final String keywords);

}