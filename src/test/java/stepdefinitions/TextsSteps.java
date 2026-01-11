package stepdefinitions;

import io.cucumber.java.en.*;
import utils.TestContext;
import static io.restassured.RestAssured.*;

public class TextsSteps extends BaseSteps {

    public TextsSteps(TestContext context) {
        super(context);
    }  

    @When("I request texts")
    public void requestTexts() {
        context.response = given().get("/texts");
    }
 
}
