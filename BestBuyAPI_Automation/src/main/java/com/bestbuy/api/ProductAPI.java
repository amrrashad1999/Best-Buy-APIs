package com.bestbuy.api;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class ProductAPI {
    private static final String BASE_URL = "http://localhost:3030";

    public static Response getAllProducts() {
        return given().when().get(BASE_URL + "/products");
    }

    public static Response addProduct(String payload) {
        return given()
                .header("Content-Type", "application/json")
                .body(payload)
                .when().post(BASE_URL + "/products");
    }
}
