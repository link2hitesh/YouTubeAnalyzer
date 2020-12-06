package models;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

/**
 *this test check wheather the channel content APIis being called or not./
 */


public class VcontentDisplyerTest extends TestCase {

    VcontentDisplyer vcontentDisplyerTester ;
    public void setUp() throws Exception {
        super.setUp();
        vcontentDisplyerTester = new VcontentDisplyer();
    }

    public void tearDown() throws Exception {
        vcontentDisplyerTester = null;
    }

    public void testFind_Fields() {
        List<String> Result = Arrays.asList("Title1//<>//Date1//<>//Author1","Title2//<>//Date2//<>//Author2");
               assertEquals(Result,vcontentDisplyerTester.Find_Fields("UC9DXAsBD4-ITVuvpd68401Q"));
    }

}