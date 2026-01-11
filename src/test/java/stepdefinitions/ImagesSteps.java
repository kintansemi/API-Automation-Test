package stepdefinitions;

import io.cucumber.java.en.*;
import utils.TestContext;
import static io.restassured.RestAssured.*;
import java.lang.annotation.Target;

public class ImagesSteps extends BaseSteps {

    public ImagesSteps(TestContext context) {
        super(context);
    }

    @When("I request images")
    public void requestImages() {
        context.response = given().get("/images");
    }
}
