package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US07 {

LoginPage loginPage= new LoginPage();

    @Given("kullanici sayfaya gider ve Login olur")
    public void kullanici_sayfaya_gider_ve_login_olur() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        loginPage.anasayfaLogin.click();
        loginPage.userName.sendKeys(ConfigReader.getProperty("deanUsername"));
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.sonLogin.click();
    }

    @Then("kullanici hesabina erisim sagladigini dogrular")
    public void kullanici_hesabina_erisim_sagladigini_dogrular() {
        Assert.assertTrue(loginPage.girisDogrulama.getText().contains("DeanOmer"));
    }
    @When("kullanici menu sekmesine tiklar")
    public void kullanici_menu_sekmesine_tiklar() {
        loginPage.menu.click();
    }
    @Then("kullanici Contact Get All'a tiklar")
    public void kullanici_contact_get_all_a_tiklar() {
        loginPage.contactGetAll.click();
    }
    @Then("kullanici Contact Message basligini gordugunu dogrular")
    public void kullanici_contact_message_basligini_gordugunu_dogrular() {
        Assert.assertTrue(loginPage.contactMessageHeader.isDisplayed());
    }
    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
       Driver.closeDriver();
    }

}
