package service;

import java.util.concurrent.CompletionStage;
import java.util.*;
import models.*;

/**
 * @AdeyinkaAreje
 * This is the interface YoutubeServiceApi  which is implemented in the Service class.
 */

public interface YoutubeServiceApi {

    public CompletionStage<List<String>> search(String word);
    CompletionStage<SearchValues> searchS(final String keywords);

}
