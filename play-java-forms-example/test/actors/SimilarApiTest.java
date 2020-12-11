package actors;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test For the sevice for SimilarContent
 *
 * @author Adeyinka
 *
 */
public class SimilarApiTest {

    static SimillarApi testClass;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        testClass = new SimillarApi();

    }

    @Test
    public void testName() {

        assertNotNull(testClass);

    }

}
