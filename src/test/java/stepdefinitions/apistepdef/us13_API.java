package stepdefinitions.apistepdef;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.fatih.Us13Pojo;

import java.util.HashMap;
import java.util.Map;

import static base_urls.SchollManagBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;

public class us13_API {
    Response response;
    Us13Pojo expectedData;
    @Given("get the teacher who is the vice dean created")
    public void get_the_teacher_who_is_the_vice_dean_created() {
        //set the url
        spec.pathParams("first","teachers","second","getTeacherByName")
                .queryParam("name","Hilario");
        response=given(spec).get("{first}/{second}");
        //response.prettyPrint();

        //set the expected data
        expectedData = new Us13Pojo(2497,"jeanette.haley","Hilario Murray","Schuster","1985-10-12"
        ,"716-17-4022","Beckertown","278-054-3850","FEMALE","ali@bey");

        System.out.println("expectedData = " + expectedData);

    }
    @Then("verify the teacher creating by the vice dean")
    public void verify_the_teacher_creating_by_the_vice_dean() {
        //response.then().statusCode(200).body("username",equalTo(expectedData.getUsername()));

        //2.validation
        JsonPath jsonPath= response.jsonPath();
        assertEquals(expectedData.getUsername(),jsonPath.getString("username.get(0)"));

        //3.validation
       // Map<String,Object> actualDataMap= response.as(HashMap.class);
       // assertEquals(expectedData.getUsername(),((Map)actualDataMap.get("username.get(0)")));

    }
}
