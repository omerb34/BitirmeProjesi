package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.AuthenticationSchollForFatih.generateTokenF;

public class SchollBaseUrlFatih {
    public static RequestSpecification spec;

    public static void schollManSetupF(){

        spec= new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization",generateTokenF())
                .setBaseUri("http://139.59.159.36:3000/").build();
    }
}
