package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPageFatih;
import utilities.ConfigReader;
import utilities.Driver;

public class US07_Fatih {
    LoginPageFatih loginPageFatih = new LoginPageFatih();

    @Given("Kullanici Anasayfaya gider")
    public void kullanici_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

    }

    @When("Kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        loginPageFatih.loginButton.click();
    }

    @Then("Kullanici user name alanina valid bir değer girer")
    public void kullanici_user_name_alanina_valid_bir_değer_girer() {
        loginPageFatih.username.sendKeys(ConfigReader.getProperty("deanUserNameFatih"));
    }

    @Then("Kullanici password alanina valid bir değer girer")
    public void kullanici_password_alanina_valid_bir_değer_girer() {
        loginPageFatih.password.sendKeys(ConfigReader.getProperty("passwordFatih"));
    }

    @Then("Kullanici lastLogin butonuna tiklar")
    public void kullaniciLastLoginButonunaTiklar() {
        loginPageFatih.lastLogin.click();
    }

    @Then("Kullanici menu butonuna tiklar")
    public void kullanici_menu_butonuna_tiklar() {
        loginPageFatih.menuButton.click();
    }

    @Then("Kullanici Main Menu alaninda yer alan Contact Get All linkini tiklar")
    public void kullanici_main_menu_alaninda_yer_alan_contact_get_all_linkini_tiklar() {
        loginPageFatih.contactGetAll.click();
    }

    @Then("Then Kullanici Contact Get All alaninda yer alan mesajlari goruntuler")
    public void thenKullaniciContactGetAllAlanindaYerAlanMesajlariGoruntuler() {
        Assert.assertTrue(loginPageFatih.mesajlar.isDisplayed());
    }

    @Then("Kullanici Contact Get All alaninda yer alan mesajlarin yazarlarini goruntuler")
    public void kullaniciContactGetAllAlanindaYerAlanMesajlarinYazarlariniGoruntuler() {
        Assert.assertTrue(loginPageFatih.mesajlarinYazarlari.isDisplayed());
    }

    @Then("Kullanici Contact Get All alaninda yer alan mesajlarin e-maillerini goruntuler")
    public void kullaniciContactGetAllAlanindaYerAlanMesajlarinEMailleriniGoruntuler() {
        Assert.assertTrue(loginPageFatih.mesajlarinEmailleri.isDisplayed());
    }

    @Then("Kullanici Contact Get All alaninda yer alan mesajlarin gonderilme tarihlerini goruntuler")
    public void kullaniciContactGetAllAlanindaYerAlanMesajlarinGonderilmeTarihleriniGoruntuler() {
        Assert.assertTrue(loginPageFatih.mesajlarinTarihleri.isDisplayed());
    }

    @When("{int} sn bekler")
    public void snBekler(int arg0) throws InterruptedException {
        Thread.sleep(2);
    }

    @Then("Kullanıcı Contact Get All alanında yer alan mesajların subject bilgilerini görüntüler")
    public void kullanıcıContactGetAllAlanındaYerAlanMesajlarınSubjectBilgileriniGoruntuler() {
        Assert.assertTrue(loginPageFatih.messageOfSubject.isDisplayed());
    }
}


