package stepdefinitions.apistepdef;

import base_urls.SchollManagBaseUrl;
import io.cucumber.java.en.Given;
import utilities.Driver;

import static base_urls.SchollManagBaseUrl.spec;

public class DenemeStepDef {
    @Given("kullanici siteye gider")
    public void kullaniciSiteyeGider() {
        // get the url
        spec.pathParam("first", "login");

    }
}
