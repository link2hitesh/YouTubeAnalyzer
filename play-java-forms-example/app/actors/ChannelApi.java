package actors;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.ResourceId;
import com.google.api.services.youtube.model.SearchListResponse;
import com.google.api.services.youtube.model.SearchResult;
import com.google.api.services.youtube.model.Thumbnail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import models.*;


/**
 * This class is used for the retrieval of video from different channel
 *  The code from this class is inspired by google data api @see https://github.com/youtube/api-samples/blob/master/java/src/main/java/com/google/api/services/samples/youtube/cmdline/data/Search.java
 * @author Ankur Aggarwal
 */
public class ChannelApi {
    private static final String PROPERTIES_FILENAME = "youtube.properties";
    private static YouTube youtube;

    /**
     * Initialize a YouTube object to search for videos on YouTube. Then
     * display the name and thumbnail image of each video in the result set.
     *
     * //@param args command line args.
     */

    public static List<channelvideolist> ChannelContent (String channelID) {
        final long NUMBER_OF_VIDEOS_RETURNED = 10;
        List<String> videoContent=new ArrayList<>();
        List< channelvideolist> sortedOrder = new ArrayList<>();

        try {

            youtube = new YouTube.Builder(new NetHttpTransport(), new JacksonFactory(), new HttpRequestInitializer() {
                public void initialize(HttpRequest request) throws IOException {
                }
            }).setApplicationName("youtube-cmdline-search-sample").build();



            YouTube.Search.List search = youtube.search().list("id,snippet");

            String apiKey = "AIzaSyCVX-vu2xWqvxUfTflXQ8ob1L0DpvpGZAo";
            search.setKey(apiKey);
            //search.setQ(queryTerm);
            search.setChannelId(channelID); //to get videos from a channel
            search.setType("video");




            search.setFields("items(id/kind,id/videoId,snippet/title,snippet/thumbnails/default/url,snippet/channelTitle,snippet/publishedAt)");
            //search.setPart("snippet/statistics");
            search.setMaxResults(NUMBER_OF_VIDEOS_RETURNED);
            search.setOrder("date"); //To get the latest videos
            SearchListResponse searchResponse = search.execute();
            List<SearchResult> searchResultList = searchResponse.getItems();
            /**
             * Use of the java 8 streams to get the title,author,date of each video of a particular channel id
             */

            if (searchResultList != null) {
                searchResultList.forEach(singleVideo -> {
                    ResourceId rId = singleVideo.getId();

                    if (rId.getKind().equals("youtube#video")) {
                        String videoDetails=singleVideo.getSnippet().getTitle()+" # DATE OF UPLOAD # "+ singleVideo.getSnippet().getPublishedAt();
                        sortedOrder.add(new channelvideolist(singleVideo.getSnippet().getTitle(),singleVideo.getSnippet().getPublishedAt().toString()));
                        videoContent.add(videoDetails);


                    }
                });
                return sortedOrder;

            }


        } catch (GoogleJsonResponseException e) {
            System.err.println("There was a service error: " + e.getDetails().getCode() + " : "
                    + e.getDetails().getMessage());
        } catch (IOException e) {
            System.err.println("There was an IO error: " + e.getCause() + " : " + e.getMessage());
        } catch (Throwable t) {
            t.printStackTrace();
        }

        return sortedOrder;
    }





}
