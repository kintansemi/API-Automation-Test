package stepdefinitions;

import io.cucumber.java.en.When;
import utils.TestContext;

import static io.restassured.RestAssured.given;

public class CreditCardsSteps extends BaseSteps {

    public CreditCardsSteps(TestContext context) {
        super(context);
    }

    @When("I request credit cards")
    public void requestCreditCards() {
        context.response = given()
                .queryParam("_quantity", 5)
                .queryParam("fields", "type,number,expiration")
                .get("/creditcards");
    }
}
