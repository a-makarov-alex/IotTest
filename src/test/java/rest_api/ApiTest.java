package rest_api;

import org.json.JSONObject;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;

public class ApiTest {
    public static final String URL = "https://httpbin.org/";

    @Test
    public void testGet() {
        Response response = RestAssured.get(URL + "/get");//then().assertThat().body("headers[0].Accept", equalTo("application/json"));

        System.out.println(response.asString());
        List<Header> headers = response.getHeaders().asList();
        System.out.println("----------- HEADERS ---------------");
        for (Header h : headers) {
            System.out.println(h.getName());
        }

    }

    @Test
    public void testPost() {
        RequestSpecification request = RestAssured.given();
        JSONObject requestBody = new JSONObject();
        requestBody.put("Name", "Vasya");
        requestBody.put("Age", "15");

        request.body(requestBody);

        Response response1 = request.post(URL + "post");
        //Assert.assertEquals(response1.getStatusCode(), 200);

        System.out.println(response1.asString());

        /*response1.then()
                .statusCode(200)
                .body("data.map.Name",equalTo("Vasya"))
                .body("data.map.Age",equalTo("15"));
         */

        /*Response response = RestAssured.post(URL + "/post");//then().assertThat().body("headers[0].Accept", equalTo("application/json"));
        System.out.println(response.asString());
        List<Header> headers = response.getHeaders().asList();
        System.out.println("----------- HEADERS ---------------");
        for (Header h : headers) {
            System.out.println(h.getName());
        }*/

    }
}
