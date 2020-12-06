package models;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * tests the data entered by the user.
 * @author adeyinka areje
 */
public class WidgetTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testWidget() {
		Widget t = new Widget("widget");
		assertEquals("widget", t.name);
		assertNotNull(t.name);
	}

}
