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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * This is the modified version of the Youtube Search API inspired by google data api @see https://github.com/youtube/api-samples/blob/master/java/src/main/java/com/google/api/services/samples/youtube/cmdline/data/Search.java
 * The class is modified in such a way so that it returns either the titles of the 100 latest videos or the full info about
 * 10 latest videos about the search term.
 * @author Hitesh Agarwal
 * @author ankur aggarwal
 * @author adeyinka areje
 */
public class Search {
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
/////////////////////////


    public static List<String> youtube_Fields(String queryTerm, boolean type, int numOfVideos) {


        // Read the developer key from the properties file.
        /*Properties properties = new Properties();
        //properties.setProperty("youtube.apikey", "AIzaSyC72WBx1JdT1bYAf-Rk4Eqra46-YZVYMss");
        try {
            InputStream in = Search.class.getResourceAsStream("/" + PROPERTIES_FILENAME);
            properties.load(in);

        } catch (IOException e) {
            System.err.println("There was an error reading " + PROPERTIES_FILENAME + ": " + e.getCause()
                    + " : " + e.getMessage());
            System.exit(1);
        }
*/
        String  ch = "";
        List<String> vvv = null;
        try {

            youtube = new YouTube.Builder(new NetHttpTransport(), new JacksonFactory(), new HttpRequestInitializer() {
                public void initialize(HttpRequest request) throws IOException { }
            }).setApplicationName("youtube-cmdline-search-sample").build();




            YouTube.Search.List search = youtube.search().list("id,snippet");

            String apiKey = "AIzaSyAICKvdtM_OGwgAjMmKLdABHSfP1JO218A";
            search.setKey(apiKey);
            search.setQ(queryTerm);
            search.setType("video");
            search.setOrder("date");

            long l= numOfVideos;

            search.setFields("items(id/kind,id/videoId,snippet/title,snippet/channelId,snippet/thumbnails/default/url,snippet/channelTitle,snippet/publishedAt)");
            search.setMaxResults(l);
            SearchListResponse searchResponse = search.execute();
            List<SearchResult> searchResultList = searchResponse.getItems();
            searchResponse.getEtag();

            vvv = new ArrayList<>();
            List<String> titles= new ArrayList<>();
            if (searchResultList != null) {
                List<String> finalVvv = vvv;
                searchResultList.forEach(singleVideo -> {
                    ResourceId rId = singleVideo.getId();
                    if (rId.getKind().equals("youtube#video")) {

                        //String viewcount = "viewcount";
                        //String posted = "postdate";
                        //Thumbnail thumbnail = singleVideo.getSnippet().getThumbnails().getDefault();
                        if(type) {
                            finalVvv.add(singleVideo.getSnippet().getChannelTitle() + "/>" + singleVideo.getSnippet().getTitle() + "/>" + vs.search(singleVideo.getId().getVideoId() )+ "/>" + singleVideo.getSnippet().getChannelId() + "/>" + singleVideo.getSnippet().getPublishedAt());

                        } else{
                            finalVvv.add(singleVideo.getSnippet().getTitle());
                        }
                    }
                });
                return vvv;

            }



        } catch (GoogleJsonResponseException e) {
            System.err.println("There was a service error: " + e.getDetails().getCode() + " : "
                    + e.getDetails().getMessage());
        } catch (IOException e) {
            System.err.println("There was an IO error: " + e.getCause() + " : " + e.getMessage());
        } catch (Throwable t) {
            t.printStackTrace();
        }
        return vvv;
    }




















}
