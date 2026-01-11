package stepdefinitions;

import io.cucumber.java.en.*;
import utils.TestContext;

import static org.junit.Assert.*;
public class AddressesSteps extends BaseSteps {

    public AddressesSteps(TestContext context) {
        super(context);
    }

    @When("I request addresses")
    public void requestAddresses() {
        context.response = io.restassured.RestAssured
                .given()
                .get("/addresses");
    }
}
