package stepdefinitions.apistepdef;

import com.github.javafaker.Faker;
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
    CreateLessonMainPojo expectedData;
    CreateLessonMainPojo actualData;
    Faker faker;

    @Given("user sends post request to creata a lesson with Compulsory.")
    public void userSendsPostRequestToCreataALessonWithCompulsory() {

        //Set the Url
        spec.pathParams("first", "lessons", "second", "save");

        //Set th expected data
        faker = new Faker();
        DataPojo dataobje= new DataPojo(12,faker.funnyName().name(),faker.number().randomDigitNotZero(),true);
        expectedData= new CreateLessonMainPojo(dataobje,"Lesson Created","OK");
        System.out.println("expectedData = " + expectedData);

        //Send request and get response
        response = given().spec(spec).body(dataobje).post("/{first}/{second}");
        response.prettyPrint();
    }

    //Do assertions
    @Then("user gets the lesson and assert that.")
    public void userGetsTheLessonAndAssertThat() {
        actualData= response.as(CreateLessonMainPojo.class);
        assertEquals(200, response.getStatusCode());
        assertEquals(expectedData.getMessage(),actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());
        assertEquals(expectedData.getObject().getLessonName(),actualData.getObject().getLessonName());
        assertEquals(expectedData.getObject().isCompulsory(),actualData.getObject().isCompulsory());
        assertEquals(expectedData.getObject().getCreditScore(),actualData.getObject().getCreditScore());

    }

    @Then("user sends post request to create a lesson without Compulsory.")
    public void userSendsPostRequestToCreateALessonWithoutCompulsory() {
        //Set the Url
        spec.pathParams("first", "lessons", "second", "save");

        //Set the expected data
        faker = new Faker();
        DataPojo dataobje= new DataPojo(99,faker.name().username(),faker.number().randomDigitNotZero(),false);
        expectedData= new CreateLessonMainPojo(dataobje,"Lesson Created","OK");

        //Send request and get response
        response = given().spec(spec).body(dataobje).post("/{first}/{second}");
        response.prettyPrint();

        //Do assertions
        actualData= response.as(CreateLessonMainPojo.class);
        assertEquals(200, response.getStatusCode());
        assertEquals(expectedData.getMessage(),actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());
        assertEquals(expectedData.getObject().getLessonName(),actualData.getObject().getLessonName());
        assertEquals(expectedData.getObject().getCreditScore(),actualData.getObject().getCreditScore());

    }
}
