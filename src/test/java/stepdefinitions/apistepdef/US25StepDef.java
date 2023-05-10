package stepdefinitions.apistepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.fatih.StudentPojo;

import static base_urls.SchollManagBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class US25StepDef {

    Response response;
    StudentPojo studentPojo;
    @Given("daha once olusturulan studenti getRequest ile getir")
    public void daha_once_olusturulan_studenti_get_request_ile_getir() {

        //set the url
        spec.pathParams("first","students","second","getStudentById")
                .queryParam("id",159);
        response=given(spec).get("{first}/{second}");
        response.prettyPrint();

        //set the expected data
        studentPojo = new StudentPojo(159,"AlexDeSouza","456-98-6547","Alex",
                "deSouza","2023-04-08","Kadıköy"
        ,"456-456-7894","MALE","mary","Jesus",
                1156,"rumizm8@hot",true);
        System.out.println("studentPojo = " + studentPojo);
    }
    @Then("student olustugunu dogrula")
    public void student_olustugunu_dogrula() {
        //validate
        StudentPojo actualData=response.as(StudentPojo.class);
        Assert.assertEquals(actualData.getName(),studentPojo.getName());
        Assert.assertEquals(actualData.getId(),studentPojo.getId());
        Assert.assertEquals(actualData.getUsername(),studentPojo.getUsername());
        Assert.assertEquals(actualData.getSsn(),studentPojo.getSsn());
        Assert.assertEquals(actualData.getSurname(),studentPojo.getSurname());
        Assert.assertEquals(actualData.getBirthDay(),studentPojo.getBirthDay());
        Assert.assertEquals(actualData.getGender(),studentPojo.getGender());
        Assert.assertEquals(actualData.getEmail(),studentPojo.getEmail());
        Assert.assertEquals(actualData.getMotherName(),studentPojo.getMotherName());
        Assert.assertEquals(actualData.getFatherName(),studentPojo.getFatherName());
        Assert.assertEquals(actualData.getStudentNumber(),studentPojo.getStudentNumber());

    }
}
