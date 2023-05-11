package stepdefinitions.gridStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LessonManagmentPage;
import pages.LoginPage;

public class Lessoncreate {
    LessonManagmentPage lessonManagmentPage= new LessonManagmentPage();
    LoginPage loginPage= new LoginPage();
    Faker faker= new Faker();


    @Given("kullanici siteye gider")
    public void kullanici_siteye_gider() {

    }
    @When("kullanici Lesson Name icin data girmelidir")
    public void kullanici_lesson_name_icin_data_girmelidir() {

    }
    @When("kullanici Credit Score icin data girmelidir")
    public void kullanici_credit_score_icin_data_girmelidir() {

    }


}
