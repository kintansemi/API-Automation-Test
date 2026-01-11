package stepdefinitions;

import io.cucumber.java.en.*;
import utils.TestContext;
import static io.restassured.RestAssured.*;

public class PersonsSteps extends BaseSteps {

    public PersonsSteps(TestContext context) {
        super(context);
    }

    @When("I request persons")
    public void requestPersons() {
        context.response = given().get("/persons");
    }

}
