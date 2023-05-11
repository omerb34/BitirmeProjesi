package stepdefinitions.gridStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.LessonManagmentPage;
import pages.LoginPage;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Lessoncreate {
    LessonManagmentPage lessonManagmentPage= new LessonManagmentPage();
    LoginPage loginPage= new LoginPage();
    Faker faker= new Faker();
    WebDriver driver;

//java -jar selenium-server-4.8.3.jar standalone
    @Given("kullanici siteye chrome ile gider")
    public void kullanici_siteye_chrome_ile_gider() throws MalformedURLException {
        driver= new RemoteWebDriver(new URL("http://192.168.1.104:4444"),new ChromeOptions());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://192.168.1.104:4444");

    }
    @When("kullanici Lesson Name icin data girmelidir")
    public void kullanici_lesson_name_icin_data_girmelidir() throws InterruptedException {
        //lessonManagmentPage.lessonName.sendKeys("sistem bilgisi",Keys.TAB,Keys.TAB);
        lessonManagmentPage.lessonName.sendKeys(faker.name().firstName(),Keys.TAB,Keys.TAB);
        Thread.sleep(3);

    }
    @When("kullanici Credit Score icin data girmelidir")
    public void kullanici_credit_score_icin_data_girmelidir() {
        lessonManagmentPage.creditScore.sendKeys("2",Keys.ENTER);

    }
      @Given("kullanici siteye edge ile gider")
    public void kullanici_siteye_edge_ile_gider() throws MalformedURLException {
          driver= new RemoteWebDriver(new URL("http://192.168.1.104:4444"),new EdgeOptions());
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
          driver.get("http://192.168.1.104:4444");

    }


    @Given("kullanici siteye firefox ile gider")
    public void kullanici_siteye_firefox_ile_gider() throws MalformedURLException {
        driver= new RemoteWebDriver(new URL("http://192.168.1.104:4444"),new FirefoxOptions());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://192.168.1.104:4444");

    }

}
