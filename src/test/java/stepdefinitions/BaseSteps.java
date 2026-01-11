package stepdefinitions;

import io.restassured.RestAssured;
import utils.ApiConfig;
import utils.TestContext;

public class BaseSteps {

    protected TestContext context;

    public BaseSteps(TestContext context) {
        this.context = context;
        RestAssured.baseURI = ApiConfig.BASE_URL;
    }
}
