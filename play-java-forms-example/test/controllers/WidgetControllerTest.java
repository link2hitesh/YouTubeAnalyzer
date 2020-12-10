package controllers;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.Http;
import play.mvc.Result;
import play.test.Helpers;
import play.test.WithApplication;

import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.*;

/**
 * Tests form processing.
 * this class tests the working of the front end part of this project.
 *
 */
public class WidgetControllerTest extends WithApplication {

    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    /**
     * this method tests the welcome page of this webapp.


    @Test
    public void testIndex() {
        Http.RequestBuilder request = Helpers.fakeRequest()
                .method(GET)
                .uri("/");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }
    /**
     * this method tests the form part of the webapp where the user will enter the search term.
     */


    @Test
    public void testlistWidgets() {
        Http.RequestBuilder request = Helpers.fakeRequest()
                .method(GET)
                .uri("/widgets");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }
    /**
     * this method tests the channel content functionality and check weather it returns the latest channel videos or not.
     * @author ankur aggarwal

    @Test
    public void testindex2() {

        Http.RequestBuilder request = Helpers.fakeRequest()
                .method(GET)
                .uri("/r/UC9DXAsBD4-ITVuvpd68401Q:name");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }
    /**
     * this method tests the similar content functionality of the web app and returns the occurrences of different words in the titles.
     * author hitesh agarwal
     */

    @Test
    public void testindex3() {
        Http.RequestBuilder request = Helpers.fakeRequest()
                .method(GET)
                .uri("/rd/Trump:Value");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }

    /**
     * this method tests the data entered by the user and then the result of the search API(mock object).


    @Test
    public void testCreateWidget() {
        Http.RequestBuilder request = Helpers.fakeRequest()
                .method(POST)
                .bodyForm(ImmutableMap.of("name","TestWidgets"))
                .uri("/widgets");

        Result result = route(app, request);
        assertEquals(SEE_OTHER, result.status());
    }
     */
}
