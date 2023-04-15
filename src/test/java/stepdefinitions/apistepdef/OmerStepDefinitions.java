
package stepdefinitions.apistepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static base_urls.SchollManagBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

public class OmerStepDefinitions {

    Response response;

    @Given("user tum kullanici mesajları icin bir get request yollar")
    public void userTumKullaniciMesajlarıIcinBirGetRequestYollar() {

        //Set the Url
        spec.pathParams("first", "contactMessages", "second", "getAll").
                queryParams("page", "0", "size", "5", "sort", "date", "type", "desc");

        //Set the expected data

        //Send request and get response
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();
    }

    //Do Assertion
    @Then("gelen mesajlarda kullanici ismini gordugunu dogrular")
    public void gelenMesajlardaKullaniciIsminiGordugunuDogrular() {
        assertTrue(response.asString().contains("name"));
    }

    //Do Assertion
    @And("gelen mesajlarda kullanici mailini gordugunu dogrular")
    public void gelenMesajlardaKullaniciMailiniGordugunuDogrular() {
        assertTrue(response.asString().contains("email"));
    }
    //Do Assertion
    @And("gelen mesajlarda mesaj konusunu gordugunu dogrular")
    public void gelenMesajlardaMesajIceriginiGordugunuDogrular() {
        assertTrue(response.asString().contains("subject"));
    }
}
