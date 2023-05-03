package stepdefinitions.apistepdef.fatih;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.ObjectPojo;
import pojos.TeacherPojo;

import static org.hamcrest.Matchers.equalTo;

import static base_urls.SchollBaseUrlFatih.spec;
import static io.restassured.RestAssured.given;

public class Us24StepDef {
    Response response;
    ObjectPojo objectPojo;
    TeacherPojo teacherPojo;

    @Given("kullanici daha once olusturulan teacheri getId ile get request yapar")
    public void kullanici_daha_once_olusturulan_teacheri_get_id_ile_get_request_yapar() {
        //set the url
        spec.pathParams("first","teachers","second","getSavedTeacherById","third",50);

        response =given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();

        //set the expected data

        objectPojo= new ObjectPojo(50,"Jorge","fatih","Jesus","1990-10-15",
        "452-54-6598","Kadikoy","222-254-2565","MALE","fatihbey@gmail");

        teacherPojo= new TeacherPojo(objectPojo,"Teacher successfully found","OK");
        System.out.println("expectedData = " + teacherPojo);

    }

    @Then("kullanici teacher olustugunu dogrular")
    public void kullanici_teacher_olustugunu_dogrular() {

        //validate-1
        response.then().statusCode(200).
                body("object.username",equalTo(objectPojo.getUsername()),
                        "object.userId", equalTo(objectPojo.getUserId()),"object.name",equalTo(objectPojo.getName()),"object.surname",equalTo(objectPojo.getSurname()),
                        "object.birthDay",equalTo(objectPojo.getBirthDay()),"object.ssn",equalTo(objectPojo.getSsn()),
                                "object.birthPlace",equalTo(objectPojo.getBirthPlace()),"object.phoneNumber",equalTo(objectPojo.getPhoneNumber())
                                ,"object.gender",equalTo(objectPojo.getGender()),"object.email",equalTo(objectPojo.getEmail()),"message",equalTo(teacherPojo.getMessage()));

        //validate2
       TeacherPojo actualData= response.as(TeacherPojo.class);
        Assert.assertEquals(teacherPojo.getObject().getUsername(),actualData.getObject().getUsername());

    }
}
