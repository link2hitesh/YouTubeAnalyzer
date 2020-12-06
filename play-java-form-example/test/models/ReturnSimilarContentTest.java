package models;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

/**
 * This test was created to chek weather the similar functionality is working;
 * checks weather the data is properly sorted as requested.
 * @author  hitesh agarwal
 */

public class ReturnSimilarContentTest extends TestCase {
    ReturnSimilarContent returnSimilarContent;
    public void setUp() throws Exception {
        super.setUp();
        returnSimilarContent= new ReturnSimilarContent();
    }

    public void tearDown() throws Exception {
        returnSimilarContent = null;
    }

    public void testReturnSimilarContent() {

        List<String> check=returnSimilarContent.returnSimilarContent("TestWidgets");

        List<String> expected= Arrays.asList("Word: test || Count: 3","Word: I || Count: 2","Word: am || Count: 1");

        assertEquals(expected,check);

    }
}