package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import utilities.AuthenticationSchollManagment;

import static utilities.AuthenticationSchollManagment.generateToken;

public class SchollManagBaseUrl {
    public static RequestSpecification spec;

    public static void schollManSetup(){

        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization", AuthenticationSchollManagment.generateToken()).
                setBaseUri("http://209.38.244.227/").build();

    }
}
