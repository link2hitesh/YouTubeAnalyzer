package models;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Test split function which Split the string in desired format to so store the value in List
 * @author Adeyinka Areje
 */

public class SplitTest {

     Split split;
	@Before
	public void setUp() throws Exception {
		split = new Split();

	}

	@After
	public void tearDown() throws Exception {
		split=null;
	}

	@Test
	public void testDataFinder() {
		List<String> testString = new ArrayList<>();
		testString.add("owner/>title/>viewCount/>chanId/>pstDate//>");
		List<Data> expectedData = new ArrayList<Data>();
		expectedData.add(new Data("owner","title","viewCount","Date","ChannelId"));
		assertNotEquals(expectedData,split.DataFinder(testString));


	}

}
