package controllers;

import junit.framework.TestCase;

/**
 * this class tests the widget data wherein it takes the string input.
 * @author hitesh agarwal
 * @author ankur aggarwal
 */
public class WidgetDataTest extends TestCase {
    static WidgetData widgetDataTest;
    String Result = "Testing This Module";
    public void setUp() throws Exception {
        super.setUp();
        widgetDataTest = new WidgetData();

        widgetDataTest.setName(Result);


    }

    public void tearDown() throws Exception {
        widgetDataTest = null;
    }

    public void testTestGetName() {
        assertEquals(Result,widgetDataTest.getName());

    }

    public void testTestSetName() {
        String Result1 = "Testing This Module2";
        widgetDataTest.setName(Result1);
        assertEquals(Result1,widgetDataTest.getName());
    }
}