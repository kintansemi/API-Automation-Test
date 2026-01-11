package stepdefinitions;

import io.cucumber.java.en.*;
import utils.TestContext;

import static io.restassured.RestAssured.*;

public class BooksSteps extends BaseSteps {

    public BooksSteps(TestContext context) {
        super(context);
    }

    @When("I request books")
    public void requestBooks() {
        context.response = given().get("/books");
    }
}
