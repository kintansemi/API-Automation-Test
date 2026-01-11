package utils;

import io.restassured.response.Response;

public class TestContext {
    public Response response;

    // 🔥 WAJIB ADA (implicit sebenarnya, tapi pastikan tidak ada constructor lain)
    public TestContext() {
    }
}
