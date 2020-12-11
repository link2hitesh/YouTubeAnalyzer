package actors;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import models.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;



/**
 * This test was written to test the OwnerPageApi.
 * @author adeyinka
 */

public class OwnerPageApiTest {

    static ChannelModel testMeth;
    static String testChanId ;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

        testMeth = new ChannelModel();
        testChanId =  "UC88MUln48JnCz4VeuPmiNPQ";
    }

    @AfterClass
    public static void teardown() {
        testMeth = null;
    }


    @Test
    public void testIt() {

        assertNotNull(testMeth.Search(testChanId));

    }


}
