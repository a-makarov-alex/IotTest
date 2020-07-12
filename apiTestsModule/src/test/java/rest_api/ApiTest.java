package rest_api;

import io.restassured.RestAssured;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;

public class ApiTest {
    private static final String URL = "https://httpbin.org/";
    private static final String QUERY_KEY = "someKey";
    private static final String QUERY_VALUE = "someValue";

    @Test
    public void testGetQuery() {
        RestAssured.given()
                .baseUri(URL)
                .basePath("get")
                .queryParam(QUERY_KEY, QUERY_VALUE)
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .body("args." + QUERY_KEY, equalTo(QUERY_VALUE));
    }

    @Test
    public void testPostQuery() {
        RestAssured.given()
                .baseUri(URL)
                .basePath("post")
                .queryParam(QUERY_KEY, QUERY_VALUE)
                .when()
                .post()
                .then()
                .assertThat()
                .statusCode(200)
                .body("args." + QUERY_KEY, equalTo(QUERY_VALUE));
    }

    @Test
    public void testPutQuery() {
        RestAssured.given()
                .baseUri(URL)
                .basePath("put")
                .when()
                .put()
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void testPatchQuery() {
        RestAssured.given()
                .baseUri(URL)
                .basePath("patch")
                .when()
                .patch()
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void testDeleteQuery() {
        RestAssured.given()
                .baseUri(URL)
                .basePath("delete")
                .when()
                .delete()
                .then()
                .assertThat()
                .statusCode(200);
    }
}
