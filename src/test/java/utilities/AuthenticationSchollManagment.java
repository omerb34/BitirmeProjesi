package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AuthenticationSchollManagment {
    public static String generateToken(){

        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("password","12345678");
        bodyMap.put("role","ADMIN");
        bodyMap.put("username","OMERBB");

        Response response = given().contentType(ContentType.JSON).body(bodyMap).post("https://school-management-v1.herokuapp.com/auth/login");
        return  response.jsonPath().getString("token");
    }
}
/*
{
    "username": "OMERBB",
    "role": "ADMIN",
    "token": "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJPTUVSQkIiLCJpYXQiOjE2ODEzNzQ5MjEsImV4cCI6MTY4MTM4MzU2MX0.5kpoI8EoYZ1g1QBmXVs_YYIohLwYWoa4-a0XNSD67hmEFhutxiFX5HiY_TgvAANSW_crbHzZe7UjxDuktzo4Hg",
    "name": "OMERBB"
}


 */