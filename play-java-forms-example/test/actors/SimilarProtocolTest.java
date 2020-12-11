package actors;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test For the SimilarProtocol Class
 *
 * @author Adeyinka
 *
 */
public class SimilarProtocolTest {

    static SimillarProtocol.SayHello2 testClass;
    static String testName ;

    /**
     * setup before
     */

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        testName =  "testJava";
        testClass = new SimillarProtocol.SayHello2(testName);

    }

    /**
     * This Tests the name method
     */
    @Test
    public void testName() {
        assertEquals("testJava",testClass.name );
        assertNotNull(testClass.name);

    }

}
