package stepdefinitions;

import io.cucumber.java.en.*;
import utils.TestContext;
import static io.restassured.RestAssured.*;
import jdk.jfr.Threshold;

public class CompaniesSteps extends BaseSteps {

    public CompaniesSteps(TestContext context) {
        super(context);
    }

    @When("I request companies")
    public void requestCompanies() {
        context.response = given().get("/companies");
    }

}
