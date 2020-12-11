package models;

import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.ResourceId;
import com.google.api.services.youtube.model.SearchListResponse;
import com.google.api.services.youtube.model.SearchResult;

import javax.inject.Inject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;


/**
 * This is the modified version of the Youtube Search API inspired by google data api @see https://github.com/youtube/api-samples/blob/master/java/src/main/java/com/google/api/services/samples/youtube/cmdline/data/Search.java
 * The class is modified in such a way so that it returns either the titles of the 100 latest videos or the full info about
 * 10 latest videos about the search term.
 * @author Hitesh Agarwal
 * @author ankur aggarwal
 * @author adeyinka areje
 */

public class Search2 {

    /**
     * Define a global variable that identifies the name of a file that
     * contains the developer's API key.
     */

    private static final String PROPERTIES_FILENAME = "youtube.properties";

    private static final long NUMBER_OF_VIDEOS_RETURNED = 10;

    static VideoStats vs = new VideoStats();

    /**
     * Define a global instance of a Youtube object, which will be used
     * to make YouTube Data API requests.
     */
    private static YouTube youtube;





    /**
     * Initialize a YouTube object to search for videos on YouTube. Then
     * display the name and thumbnail image of each video in the result set.
     *

     */




    /**
     * This method is used to wrap the synchronous api into asynchronous wrapper
     * @return CompletableFuture

     */

    public CompletionStage<List<check>> AsynYoutube (String Fields_Search){
        return CompletableFuture.supplyAsync(()-> youtube_Field(Fields_Search));

    }


    /**
     * This method is used to call the youtube api
     * @return List of check

     */

    public static List<check> youtube_Field (String queryTerm) {


        List<String> vvv = null;
        List<check> vvvvv = null;
        try {

            youtube = new YouTube.Builder(new NetHttpTransport(), new JacksonFactory(), new HttpRequestInitializer() {
                public void initialize(HttpRequest request) throws IOException { }
            }).setApplicationName("youtube-cmdline-search-sample").build();

            YouTube.Search.List search = youtube.search().list("id,snippet");

            String apiKey = "AIzaSyC9bO1UKhrXrl1AnuSOAVI1QC9Mvwsa3T8";
            search.setKey(apiKey);
            search.setQ(queryTerm);
            search.setType("video");
            search.setOrder("date");
            search.setFields("items(id/kind,id/videoId,snippet/title,snippet/channelId,snippet/thumbnails/default/url,snippet/channelTitle,snippet/publishedAt)");
            search.setMaxResults(NUMBER_OF_VIDEOS_RETURNED);
            SearchListResponse searchResponse = search.execute();
            List<SearchResult> searchResultList = searchResponse.getItems();
            searchResponse.getEtag();
            vvv = new ArrayList<>();

            List<Data> ListofVideos = new ArrayList<>();
            List<check> ListofDisplay = new ArrayList<>();

            if (searchResultList != null) {

                List<String> finalVvv = vvv;
                searchResultList.forEach(singleVideo -> {
                    ResourceId rId = singleVideo.getId();
                    if (rId.getKind().equals("youtube#video")) {
                        Data videos =  new Data(singleVideo.getSnippet().getChannelTitle(),singleVideo.getSnippet().getTitle(),vs.search(singleVideo.getId().getVideoId()) ,singleVideo.getSnippet().getChannelId(),singleVideo.getSnippet().getPublishedAt().toString());

                            ListofVideos.add(videos);


                            finalVvv.add(singleVideo.getSnippet().getChannelTitle() + "/>" + singleVideo.getSnippet().getTitle() + "/>" + vs.search(singleVideo.getId().getVideoId() )+ "/>" + singleVideo.getSnippet().getChannelId() + "/>" + singleVideo.getSnippet().getPublishedAt());
                    }
                });

                ListofDisplay.add(new check(queryTerm,ListofVideos));


                return  ListofDisplay;

            }



        } catch (GoogleJsonResponseException e) {
            System.err.println("There was a service error: " + e.getDetails().getCode() + " : "
                    + e.getDetails().getMessage());
        } catch (IOException e) {
            System.err.println("There was an IO error: " + e.getCause() + " : " + e.getMessage());
        } catch (Throwable t) {
            t.printStackTrace();
        }
        return null;
    }




















}
