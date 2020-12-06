package models;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

/**
 *Splits the data recieved from the channel content into a displayable format.
 * @author ankuraggarwal
 */
public class VideospliterTest extends TestCase {
    Videospliter videosplitertester;
    public void setUp() throws Exception {
        super.setUp();
        videosplitertester = new Videospliter();

    }

    public void tearDown() throws Exception {
        videosplitertester = null;
    }

    public void testVediocontentarranger() {
        List<String>  query = Arrays.asList("Title1//<>//Date1//<>//Author1","Title2//<>//Date2//<>//Author2");
        List<String>  Result = Arrays.asList("Title1 # DATE OF UPLOAD # Date1","Title2 # DATE OF UPLOAD # Date2");
        assertEquals(Result,videosplitertester.vediocontentarranger(query));


    }



}


//"Title1//<>//Date1//<>//Author1","Title2//<>//Date2//<>//Author2"
// String valuew =parts2[0]+" # DATE OF UPLOAD # "+parts2[1];