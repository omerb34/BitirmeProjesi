package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPageFatih;
import utilities.ConfigReader;
import utilities.Driver;

public class US16StepDefinitions {
    LoginPageFatih loginPageFatih= new LoginPageFatih();
    @Given("Kullanıcı Anasayfaya gider")
    public void kullanıcıAnasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }

    @When("Kullanıcı login butonuna tıklar")
    public void kullanıcıLoginButonunaTıklar() {
        loginPageFatih.loginButton.click();
    }

    @Then("Kullanıcı user name alanına valid bir değer girer")
    public void kullanıcıUserNameAlanınaValidBirDegerGirer() {
        loginPageFatih.username.sendKeys(ConfigReader.getProperty("viceDeanUserName"));
    }

    @Then("Kullanıcı password alanına valid bir değer girer")
    public void kullanıcıPasswordAlanınaValidBirDegerGirer() {
        loginPageFatih.password.sendKeys(ConfigReader.getProperty("passwordViceDean"));
    }

    @Then("Kullanıcı menu butonuna tıklar")
    public void kullanıcıMenuButonunaTıklar() {
        loginPageFatih.viceDeanMenuButton.click();
    }

    @Then("Kullanıcı Main Menu alanında yer alan Contact Get All linkini tıklar")
    public void kullanıcıMainMenuAlanındaYerAlanContactGetAllLinkiniTıklar() {
        loginPageFatih.viceDeanContactGetAll.click();
    }

    @Then("Kullanıcı Contact Get All alanında yer alan mesajları görüntüler")
    public void kullanıcıContactGetAllAlanındaYerAlanMesajlarıGoruntuler() {
        Assert.assertTrue(loginPageFatih.viceDeanMessages.isDisplayed());
    }

    @Then("Kullanıcı lastLogin butonuna tıklar")
    public void kullanıcıLastLoginButonunaTıklar() {
        loginPageFatih.lastLogin.click();
    }
    @Then("Kullanıcı Contact Get All alanında yer alan mesajların yazarlarını görüntüler")
    public void kullanıcıContactGetAllAlanındaYerAlanMesajlarınYazarlarınıGoruntuler() {
        Assert.assertTrue(loginPageFatih.mesajlarinYazarlari.isDisplayed());
    }

    @Then("Kullanıcı Contact Get All alanında yer alan mesajların e-maillerini görüntüler")
    public void kullanıcıContactGetAllAlanındaYerAlanMesajlarınEMailleriniGoruntuler() {
        Assert.assertTrue(loginPageFatih.viceDeanEmail.isDisplayed());
    }

    @Then("Kullanıcı Contact Get All alanında yer alan mesajların gönderilme tarihlerini görüntüler")
    public void kullanıcıContactGetAllAlanındaYerAlanMesajlarınGonderilmeTarihleriniGoruntuler() {
        Assert.assertTrue(loginPageFatih.viceDeanMesajTarih.isDisplayed());
    }

    @Then("Kullanıcı Contact Get All alanında yer alan mesajlarınn subject bilgilerini görüntüler")
    public void kullanıcıContactGetAllAlanındaYerAlanMesajlarınnSubjectBilgileriniGoruntuler() {
        Assert.assertTrue(loginPageFatih.viceDeanSubject.isDisplayed());
    }

    @Then("Kullanıcı Contact Get All alanında yer alan Contact Message yazısini goruntuler")
    public void kullanıcıContactGetAllAlanındaYerAlanContactMessageYazısiniGoruntuler() {
        Assert.assertTrue(loginPageFatih.viceDeanContactMessagePage.isDisplayed());
    }
}
