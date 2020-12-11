package service;


import static org.junit.Assert.*;
import java.util.concurrent.CompletionStage;
import service.*;
import java.util.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test the youtubeServiceImp
 * @author adeyinka
 */
public class YoutubeTestServiceImpl{

    static SearchServiceImpl testService;

    @BeforeClass
    public static void setup() {

        testService = new SearchServiceImpl();
    }

    @Test
    public void testImpl(){

        List<String>result = testService.youtube_Fields("java", true, 10);
        assertNotNull(result);
    }


}