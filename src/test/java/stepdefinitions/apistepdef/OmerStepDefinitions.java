
package stepdefinitions.apistepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static base_urls.SchollManagBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class OmerStepDefinitions {
    @Given("user tum kullanici mesajları icin bir get request yollar")
    public void userTumKullaniciMesajlarıIcinBirGetRequestYollar() {
        //Set the Url
        spec.pathParams("first","contactMessages","second","getAll").
                queryParams("page","0","size" ,"30","sort","date","type","desc");

        //Set the expected data

        //Sen request and get response
        Response response= given(spec).get("{first}/{second}");
        response.prettyPrint();
        //Do Assertion
    }

    @Then("gelen mesajlarda kullanici ismini gordugunu dogrular")
    public void gelenMesajlardaKullaniciIsminiGordugunuDogrular() {
    }

    @And("gelen mesajlarda kullanici mailini gordugunu dogrular")
    public void gelenMesajlardaKullaniciMailiniGordugunuDogrular() {
    }

    @And("gelen mesajlarda mesaj icerigini gordugunu dogrular")
    public void gelenMesajlardaMesajIceriginiGordugunuDogrular() {
    }


}
