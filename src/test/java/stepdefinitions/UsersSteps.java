package stepdefinitions;

import io.cucumber.java.en.*;
import utils.TestContext;
import static io.restassured.RestAssured.*;

public class UsersSteps extends BaseSteps {

    public UsersSteps(TestContext context) {
        super(context);
    }

    @When("I request users")
    public void requestUsers() {
        context.response = given().get("/users");
    }
}
