package request;

import io.restassured.response.Response;
import model.Body;

import static io.restassured.RestAssured.given;

public class Request {

    public static Response get(String path) {
        return given()
                .spec(Specification.getRequestSpecification())
                .get(path)
                .then()
                .spec(Specification.getResponseSpecification())
                .extract()
                .response();
    }

    public static Response post(String path, Body body) {
        return given()
                .spec(Specification.getRequestSpecification())
                .body(body)
                .post(path)
                .then()
                .spec(Specification.getResponseSpecification())
                .extract()
                .response();
    }

    public static Response put(String path, Body body) {
        return given()
                .spec(Specification.getRequestSpecification())
                .body(body)
                .put(path)
                .then()
                .spec(Specification.getResponseSpecification())
                .extract()
                .response();
    }

    public static Response delete(String path) {
        return given()
                .spec(Specification.getRequestSpecification())
                .delete(path)
                .then()
                .spec(Specification.getResponseSpecification())
                .extract()
                .response();
    }

}
