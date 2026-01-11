package stepdefinitions;

import io.cucumber.java.en.*;
import utils.TestContext;

import static org.junit.Assert.*;

public class CommonSteps extends BaseSteps {

    public CommonSteps(TestContext context) {
        super(context);
    }

    @Given("Faker API is ready")
    public void fakerApiReady() {
        // baseURI already set in BaseSteps
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
