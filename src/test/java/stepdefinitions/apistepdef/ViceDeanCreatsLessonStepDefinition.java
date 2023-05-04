package stepdefinitions.apistepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.viceDeanCreatsLesson.US08_ViceDeanCreatsLessonMainPojo;
import pojos.viceDeanCreatsLesson.US08_ViceDeanCreatsLessonObjectPojo;
import static base_urls.SchollManagBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class ViceDeanCreatsLessonStepDefinition {

    US08_ViceDeanCreatsLessonObjectPojo objectPojo;
    US08_ViceDeanCreatsLessonMainPojo expectedData;
    US08_ViceDeanCreatsLessonMainPojo actualData;
    Response response;

    @Given("Kullanici olusturdugu ilk dersi gormek icin bir get request gonderir")
    public void kullanici_olusturdugu_ilk_dersi_gormek_icin_bir_get_request_gonderir() {

    //Set the Url http://164.92.252.42:8080/lessons/getLessonByName?lessonName=SiyasetFelsefesi
        spec.pathParams("first", "lessons", "second", "getLessonByName")
                .queryParams("lessonName", "SiyasetFelsefesi");

    //Set the expected data
        objectPojo = new US08_ViceDeanCreatsLessonObjectPojo(132, "SiyasetFelsefesi", 8, true);
        expectedData = new US08_ViceDeanCreatsLessonMainPojo(objectPojo, "Lesson successfully found");
        System.out.println("expectedData = " + expectedData);

    //Send request and get response
        response= given().spec(spec).get("{first}/{second}");
        response.prettyPrint();
    }

    //Do assertion
    @Then("Kullanici olusturdugu ilk dersi gordugunu dogrular")
    public void kullanici_olusturdugu_ilk_dersi_gordugunu_dogrular() {
       actualData =  response.as(US08_ViceDeanCreatsLessonMainPojo.class);
       assertEquals(200,response.getStatusCode());
      // assertEquals(expectedData.getObject().getLessonId(),actualData.getObject().getLessonId());
       assertEquals(expectedData.getObject().getLessonName(),actualData.getObject().getLessonName());
       assertEquals(expectedData.getObject().getCreditScore(),actualData.getObject().getCreditScore());
       assertEquals(expectedData.getObject().isCompulsory(),actualData.getObject().isCompulsory());

    }

    @Given("Kullanici olusturdugu ikinci dersi gormek icin bir get request gonderir")
    public void kullaniciOlusturduguIkinciDersiGormekIcinBirGetRequestGonderir() {

        spec.pathParams("first", "lessons", "second", "getLessonByName")
                .queryParams("lessonName", "OrtaCagTarihi");

        objectPojo = new US08_ViceDeanCreatsLessonObjectPojo(130, "OrtaCagTarihi", 8, false);
        expectedData = new US08_ViceDeanCreatsLessonMainPojo(objectPojo, "Lesson successfully found");

        response= given().spec(spec).get("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Kullanici olusturdugu ikinci dersi gordugunu dogrular")
    public void kullaniciOlusturduguIkinciDersiGordugunuDogrular() {

        actualData =  response.as(US08_ViceDeanCreatsLessonMainPojo.class);
        assertEquals(200,response.getStatusCode());
       // assertEquals(expectedData.getObject().getLessonId(),actualData.getObject().getLessonId());
        assertEquals(expectedData.getObject().getLessonName(),actualData.getObject().getLessonName());
        assertEquals(expectedData.getObject().getCreditScore(),actualData.getObject().getCreditScore());
        assertEquals(expectedData.getObject().isCompulsory(),actualData.getObject().isCompulsory());


    }
}




/*
{
    "object": {
        "lessonId": 132,
        "lessonName": "SiyasetFelsefesi",
        "creditScore": 8,
        "compulsory": true
    },
    "message": "Lesson successfully found"

    {
    "object": {
        "lessonId": 130,
        "lessonName": "OrtaCagTarihi",
        "creditScore": 8,
        "compulsory": false
    },
    "message": "Lesson successfully found"
}
}

 */