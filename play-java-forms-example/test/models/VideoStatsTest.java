package models;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test For VideoStats method for retrieving video view count
 * 
 * @author Adeyinka
 *
 */
public class VideoStatsTest {
	
	static VideoStats testMeth;
	static String testVideoId;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testMeth = new VideoStats();
		testVideoId = "TMIkAY_Xafk";
	}

	@Test
	public void testSearch() {
		assertNotNull(testMeth.search(testVideoId));
	}

}
