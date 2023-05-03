package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AuthenticationSchollForFatih {
    public static void main(String[] args) {
        System.out.println(generateTokenF());
    }


    public static String generateTokenF(){

        Map<String, Object> bodyyMap= new HashMap<>();
        bodyyMap.put("username","AdminB103");
        bodyyMap.put("password","12345678");

        Response response= given().contentType(ContentType.JSON).body(bodyyMap).post("http://164.92.252.42:8080/auth/login");
        return response.jsonPath().getString("token");

    }

}
