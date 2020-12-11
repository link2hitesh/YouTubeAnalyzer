package actors;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test For the ChannelprotocolClass
 *
 * @author Adeyinka
 *
 */
public class ChannelProtocolTest {

    static ChannelVideoProtocol.SayHello testClass;
    static String testName ;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        testName =  "testName";
        testClass = new ChannelVideoProtocol.SayHello(testName);
    }

    @Test
    public void testName() {
        assertEquals("testName",testClass.name );
        assertNotNull(testClass.name);

    }

}
