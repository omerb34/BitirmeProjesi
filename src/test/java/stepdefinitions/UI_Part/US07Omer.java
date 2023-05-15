package stepdefinitions.UI_Part;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US07Omer {

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
        Assert.assertTrue(loginPage.girisDogrulama.getText().contains("ViceDeanTeam_17"));
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

    @When("kullanici message kutusunu gorur")
    public void kullaniciMessageKutusunuGorur() {
        Assert.assertTrue(loginPage.messageKutusu.isDisplayed());
    }
    @Then("kullanici mesaj kutusunun bos olmadigini dogrular")
    public void kullaniciMesajKutusununBosOlmadiginiDogrular() {
        Assert.assertTrue(loginPage.messajIcerik.isDisplayed());
    }
    @When("kullanici {string} kutusunu gorur")
    public void kullaniciKutusunuGorur(String arg0) {
        Assert.assertTrue(loginPage.NameKutusu.isDisplayed());
    }
    @Then("kullanici {string} kutusunun bos olmadigini dogrular")
    public void kullaniciKutusununBosOlmadiginiDogrular(String arg0) {
        Assert.assertTrue(loginPage.nameIcerik.isDisplayed());
    }
    @When("kullanici email kutusunu gorur")
    public void kullaniciEmailKutusunuGorur() {
        Assert.assertTrue(loginPage.emailKutusu.isDisplayed());

    }
    @Then("kullanici email kutusunun bos olmadigini dogrular")
    public void kullaniciEmailKutusununBosOlmadiginiDogrular() {
        Assert.assertTrue(loginPage.emailIcerik.isDisplayed());
    }

    @When("kullanici subject kutusunu gorur")
    public void kullaniciSubjectKutusunuGorur() {
        Assert.assertTrue(loginPage.subjectKutusu.isDisplayed());

    }

    @Then("kullanici subject kutusunun bos olmadigini dogrular")
    public void kullaniciSubjectKutusununBosOlmadiginiDogrular() {
        Assert.assertTrue(loginPage.subjectIcerik.isDisplayed());
    }

    @When("kullanici Date kutusunu gorur")
    public void kullaniciDateKutusunuGorur() {
        Assert.assertTrue(loginPage.dateKutusu.isDisplayed());
    }

    @Then("kullanici Date kutusunun bos olmadigini dogrular")
    public void kullaniciDateKutusununBosOlmadiginiDogrular() {
        Assert.assertTrue(loginPage.dateIcerik.isDisplayed());
    }

}
