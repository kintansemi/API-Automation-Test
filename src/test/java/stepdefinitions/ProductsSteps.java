package stepdefinitions;

import io.cucumber.java.en.*;
import utils.TestContext;
import static io.restassured.RestAssured.*;

public class ProductsSteps extends BaseSteps {

    public ProductsSteps(TestContext context) {
        super(context);
    }

    @When("I request products")
    public void requestProducts() {
        context.response = given().get("/products");
    }
}
