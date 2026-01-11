package stepdefinitions;

import io.cucumber.java.en.*;
import utils.TestContext;

import static io.restassured.RestAssured.*;

public class CustomSteps extends BaseSteps {

    public CustomSteps(TestContext context) {
        super(context);
    }

    @When("I request custom data with quantity {int}")
    public void requestCustom(int qty) {
        context.response = given()
                .queryParam("_quantity", qty)
                .queryParam("custom_field", "name")
                .get("/custom");
    }
}
