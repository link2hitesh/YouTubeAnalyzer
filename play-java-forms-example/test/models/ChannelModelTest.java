package models;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test For the Channel Method that returns channel information
 * 
 * @author Adeyinka
 *
 */
public class ChannelModelTest {
	
	static ChannelModel testMeth;
	static String testChanId ;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		testMeth = new ChannelModel();
		testChanId =  "UCdOp8DxiQw6hKZ9b2FY6hbg";
	}

	@Test
	public void testSearch() {
		
		assertNotNull(testMeth.Search(testChanId));
	
	}

}
