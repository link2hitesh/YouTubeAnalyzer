package models;

import static org.junit.Assert.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;



/**
 * This test was written to check the order in which the data from the split class is returned in the correct order.
 * @author ankuraggarwal
 */

public class CheckTest {
	
	static check testCheck ;
	static String value;
	static List <Data> testList;



	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//testList = new ArrayList<Data>();
		value = "owner:title:viewCount:pstDate:chanId";
		testCheck = new check(value, testList);
		
	}



	@Test
	public void testGetValue() {
		assertNotNull(testCheck.getValue());
		assertEquals("owner:title:viewCount:pstDate:chanId", testCheck.getValue());
	}



	@Test
	public void testSetValue() {
		testCheck.setValue("Newowner:title:viewCount:pstDate:chanId");
		assertNotNull(testCheck.Value);
	}

	@Test
	public void testSetValue2() {
		testCheck.setValue2(new ArrayList<Data>());
		assertNotNull(testCheck.value2);
	}

	@Test
	public void testGetValue2() {
		assertNotNull(testCheck.getValue2());
		
		assertEquals(new ArrayList<Data>(), testCheck.getValue2());
	}

	

}
