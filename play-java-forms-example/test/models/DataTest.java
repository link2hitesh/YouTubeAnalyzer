package models;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;



/**
 * This test was written to check the object being created; weather the data fields in the objects contain the right result.
 * @author hitesh agarwal
 */


public class DataTest {



	static Data testData;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testData =  new Data("defaultOwner","testTitle","testViewCount", "testPostedDate", "testChanId");
	}

	@Test
	public void testGetChid() {
		assertEquals("testChanId", testData.getChid());
		
	}

	@Test
	public void testSetChid() {
		assertEquals("testChanId", testData.getChid());	}

	@Test
	public void testGetViewcount() {
		assertEquals("testViewCount", testData.getViewcount());	}

	@Test
	public void testSetViewcount() {
		testData.setViewcount("NEWVIEWCOUNT");
		assertNotNull(testData.viewcount);
		
	}

	@Test
	public void testGetPosted() {
		assertEquals("NewPostDate", testData.getPosted());	}

	@Test
	public void testSetPosted() {
		testData.setPosted("NewPostDate");
		assertNotNull(testData.posted);	
	}

	@Test
	public void testGetAuthor() {
		assertEquals("testOwnerNew", testData.getAuthor());	}

	@Test
	public void testSetAuthor() {
		testData.setAuthor("testOwnerNew");
		assertNotNull(testData.author);	
		
	}

	@Test
	public void testSetTitle() {
		testData.setTitle("testTitleNew");
		assertNotNull(testData.title);
		
	}

	@Test
	public void testGetTitle() {
		assertEquals("testChanId", testData.getChid());
		
	}

}
