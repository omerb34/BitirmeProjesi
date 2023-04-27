package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AuthenticationSchollManagment {
    public static String generateToken(){

        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("password","485424698");
        bodyMap.put("username","Admin");

        Response response = given().
                contentType(ContentType.JSON).
                body(bodyMap).
                post("https://www.managementonschools.com/auth/login");
        return  response.jsonPath().getString("token");
    }
}
/*
{
    "username": "OMERBB",
    "role": "ADMIN",
    "token": "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJPTUVSQkIiLCJpYXQiOjE2ODEzNzQ5MjEsImV4cCI6MTY4MTM4MzU2MX0.5kpoI8EoYZ1g1QBmXVs_YYIohLwYWoa4-a0XNSD67hmEFhutxiFX5HiY_TgvAANSW_crbHzZe7UjxDuktzo4Hg",
    "name": "OMERBB"

OK
Example Value
Model
{
  "isAdvisor": "string",
  "name": "string",
  "role": "string",
  "ssn": "string",
  "token": "string",
  "username": "string"
}

}


 */