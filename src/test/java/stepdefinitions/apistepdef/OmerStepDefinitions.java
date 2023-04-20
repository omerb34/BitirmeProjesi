
package stepdefinitions.apistepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_urls.SchollManagBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
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
    @When("status code {int} oldugunu dogrular")
    public void statusCodeOldugunuDogrular(int arg0) {
        assertEquals(200, response.getStatusCode());
    }

    @Then("gelen mesajlarda kullanici ismini gordugunu dogrular")
    public void gelenMesajlardaKullaniciIsminiGordugunuDogrular() {
        assertTrue(response.asString().contains("name"));

        //2.yol
        //JsonPath jsonPath = response.jsonPath();
        //System.out.println("jsonPath.getList(\"content.name\") = " + jsonPath.getList("content.name"));
        //assertTrue(jsonPath.getList("content.name").contains("asd"));

    }

    @And("gelen mesajlarda kullanici mailini gordugunu dogrular")
    public void gelenMesajlardaKullaniciMailiniGordugunuDogrular() {
        assertTrue(response.asString().contains("email"));
    }

    @And("gelen mesajlarda mesaj konusunu gordugunu dogrular")
    public void gelenMesajlardaMesajIceriginiGordugunuDogrular() {
        assertTrue(response.asString().contains("subject"));
    }
}
/*

{
    "content": [
        {
            "name": "",
            "email": "jackz@gmail.com",
            "subject": "fdgdfg gdf ",
            "message": "",
            "date": "2023-04-16"
        },
        {
            "name": "eqweq",
            "email": "qwerqwer@q",
            "subject": "eqeqwe qw",
            "message": "qweqew qw eqwe ",
            "date": "2023-04-16"
        },
        {
            "name": "asd",
            "email": "kdgkl@gmail.com",
            "subject": "fas",
            "message": "fsdfsdf",
            "date": "2023-04-16"
        },
        {
            "name": "",
            "email": "jack@gmail.com",
            "subject": "13131",
            "message": "",
            "date": "2023-04-16"
        },
        {
            "name": "Adem",
            "email": "ad@gmail.com",
            "subject": "info",
            "message": "I love you",
            "date": "2023-04-16"
        }
    ],
    "pageable": {
        "sort": {
            "sorted": true,
            "unsorted": false,
            "empty": false
        },
        "pageNumber": 0,
        "pageSize": 5,
        "offset": 0,
        "unpaged": false,
        "paged": true
    },
    "totalPages": 230,
    "totalElements": 1146,
    "last": false,
    "first": true,
    "sort": {
        "sorted": true,
        "unsorted": false,
        "empty": false
    },
    "numberOfElements": 5,
    "size": 5,
    "number": 0,
    "empty": false
}


 */