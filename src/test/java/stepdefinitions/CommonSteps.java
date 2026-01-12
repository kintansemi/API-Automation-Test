package stepdefinitions;

import io.cucumber.java.en.*;
import utils.TestContext;

import static org.junit.Assert.*;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

public class CommonSteps extends BaseSteps {

    public CommonSteps(TestContext context) {
        super(context);
    }

    @Given("Faker API is ready")
    public void fakerApiReady() {
        RestAssured.baseURI = "https://fakerapi.it/api/v1";

        // GLOBAL LOGGING (request & response)
        RestAssured.filters(
                new RequestLoggingFilter(),
                new ResponseLoggingFilter());
    }

    @Then("response should contain {int} items")
    public void validateResponseItemCount(int qty) {
        assertEquals(qty, context.response.jsonPath().getList("data").size());
    }

    @Then("response data should not be empty")
    public void validateDataNotEmpty() {
        assertNotNull(context.response);
        assertFalse(context.response.jsonPath().getList("data").isEmpty());
    }

    @Then("response status code should be {int}")
    public void validateStatusCodeGeneric(int code) {
        assertEquals(code, context.response.getStatusCode());
    }

}
