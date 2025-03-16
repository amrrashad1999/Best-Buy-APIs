package com.bestbuy.stepDefinitions;

import com.bestbuy.api.ProductAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.testng.Assert;

public class ProductSteps {
    private Response response;

    @Given("I send a GET request to {string}")
    public void iSendAGETRequestTo(String endpoint) {
        response = ProductAPI.getAllProducts();
    }

    @Then("The response status should be {int}")
    public void theResponseStatusShouldBe(int statusCode) {
        Assert.assertEquals(response.getStatusCode(), statusCode);
    }
}
