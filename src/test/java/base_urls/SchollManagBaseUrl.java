package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.AuthenticationSchollManagment.generateToken;

public class SchollManagBaseUrl {
    public static RequestSpecification spec;

    public static void schollManSetup(){

        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization","Bearer "+generateToken()).
                setBaseUri("https://www.managementonschools.com").build();

    }
}
