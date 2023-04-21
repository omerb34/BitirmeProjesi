package stepdefinitions.apistepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.omerus08.CreateLessonMainPojo;
import pojos.omerus08.DataPojo;

import static base_urls.SchollManagBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US08OmerStedDefinitions {
    Response response;

    /*
 {
    "object": {
        "lessonId": 2239,
        "lessonName": "omerdenemedersiapi8",
        "creditScore": 4,
        "compulsory": true
    },
    "message": "Lesson Created",
    "httpStatus": "OK"
}
   */

    @Given("user sends post request to creata a lesson with Compulsory.")
    public void userSendsPostRequestToCreataALessonWithCompulsory() {

        //Set the Url
        spec.pathParams("first", "lessons", "second", "save");

        //Set th expected data
        DataPojo dataobje= new DataPojo(12,"siyaset bilimison2",4,true);
        CreateLessonMainPojo expectedData= new CreateLessonMainPojo(dataobje,"Lesson Created","OK");
        System.out.println("expectedData = " + expectedData);

        //Send request and get response
        response = given().spec(spec).body(dataobje).post("/{first}/{second}");
        response.prettyPrint();

        //Do assertions
        CreateLessonMainPojo actualData= response.as(CreateLessonMainPojo.class);
        assertEquals(200, response.getStatusCode());
        assertEquals(expectedData.getMessage(),actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());
        assertEquals(expectedData.getObject().getLessonName(),actualData.getObject().getLessonName());
        assertEquals(expectedData.getObject().isCompulsory(),actualData.getObject().isCompulsory());
        assertEquals(expectedData.getObject().getCreditScore(),actualData.getObject().getCreditScore());
    }


    @Then("user gets the lesson and assert that.")
    public void userGetsTheLessonAndAssertThat() {






    }


}
