package stepdefinitions;

import org.openqa.selenium.WebElement;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LessonManagmentPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US08Omer {

    LessonManagmentPage lessonManagmentPage= new LessonManagmentPage();
    LoginPage loginPage= new LoginPage();
    Faker faker=new Faker();


    @Given("kullanici sayfaya gider ve Vice Dean olarak Login olur")
    public void kullanici_sayfaya_gider_ve_vice_dean_olarak_login_olur() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        loginPage.anasayfaLogin.click();
        loginPage.userName.sendKeys(ConfigReader.getProperty("viceDeanUserName"));
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.sonLogin.click();

    }
    @Then("kullanici Lesson Managment'e tiklar")
    public void kullanici_lesson_managment_e_tiklar() {
        lessonManagmentPage.lessonManagment.click();
    }

    @Then("kullanici lesson'a tiklar")
    public void kullaniciLessonATiklar() {
        lessonManagmentPage.lessons.click();
    }

    @Given("Kullanici Lessons Managmante ulastigini dogrular")
    public void kullaniciLessonsManagmanteUlastiginiDogrular() {
        Assert.assertTrue(lessonManagmentPage.lessonManagmentDogrulama.isDisplayed());
    }


    @Given("kullanici Lesson Name kutusunu gorur")
    public void kullaniciLessonNameKutusunuGorur() {
        lessonManagmentPage.lessonName.isDisplayed();
    }

    @Then("kullanici Lesson Name kutusu altındaki Required yazisini gorur")
    public void kullaniciLessonNameKutusuAltındakiRequiredYazisiniGorur() {
        lessonManagmentPage.requiredLessonName.isDisplayed();
        
    }

    @Then("kullanici Credit Score kutucusunu gorur")
    public void kullaniciCreditScoreKutucusunuGorur() {
        lessonManagmentPage.creditScore.isDisplayed();
    }

    @Then("Kullanici Credit Score kutusu altındaki Required yazisini gorur")
    public void kullaniciCreditScoreKutusuAltındakiRequiredYazisiniGorur() {
        lessonManagmentPage.requiredCreditScore.isDisplayed();
    }
    @When("kullanici Lesson Name icin data girer")
    public void kullaniciLessonNameIcinDataGirer() {
        lessonManagmentPage.lessonName.sendKeys(faker.name().name());
    }

    @When("kullanici Credit Score icin data girer")
    public void kullaniciCreditScoreIcinDataGirer() {
        lessonManagmentPage.creditScore.sendKeys("5");
    }


    @Then("kullanici Submit tusuna basar")
    public void kullaniciSubmitTusunaBasar() {
        lessonManagmentPage.submit.click();
    }


    @Then("kullanici {string} yazisini gorur")
    public void kullaniciYazisiniGorur(String arg0) {
        lessonManagmentPage.lessonCreated.isDisplayed();

    }
}
