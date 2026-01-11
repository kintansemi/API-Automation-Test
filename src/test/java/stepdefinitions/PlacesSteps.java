package stepdefinitions;

import io.cucumber.java.en.*;
import utils.TestContext;
import static io.restassured.RestAssured.*;

public class PlacesSteps extends BaseSteps {

    public PlacesSteps(TestContext context) {
        super(context);
    }

    @When("I request places")
    public void requestPlaces() {
        context.response = given().get("/places");
    } 
}
