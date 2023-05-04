package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPageFatih {
    public LoginPageFatih(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='header_link ms-2']")
    public WebElement loginButton;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary']")
    public WebElement lastLogin;

    @FindBy(xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menuButton;

    @FindBy(xpath = "(//*[@class='nav-link'])[7]")
    public WebElement contactGetAll;

    @FindBy(xpath = "//*[@class='fw-bold p-3 card-header']")
    public WebElement deanMesajPage;

    @FindBy(xpath = "//tbody/tr[1]/td[5]")
    public WebElement deanMessages;

    @FindBy(xpath = "(//tbody//tr//td[1])[1]")
    public WebElement deanMesajYazarlari;

    @FindBy(xpath = "(//tbody//tr//td[2])[1]")
    public WebElement mesajlarinEmailleri;

    @FindBy(xpath = "(//tbody//tr//td[3])[1]")
    public WebElement deanMesajTarihleri;

    @FindBy(xpath = "(//tbody//tr//td[4])[1]")
    public WebElement deanMessageOfSubject;

    @FindBy(xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement viceDeanMenuButton;

    @FindBy(xpath = "(//*[@class='nav-link'])[11]")
    public WebElement viceDeanContactGetAll;

    @FindBy(xpath = "//*[@class='fw-bold p-3 card-header']")
    public WebElement viceDeanContactMessagePage;

    @FindBy(xpath = "//tbody/tr[1]/td[5]")
    public WebElement viceDeanMessages;

    @FindBy(xpath = "(//tbody//tr//td[1])[1]")
    public WebElement viceDeanMessageYazar;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement viceDeanEmail;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement viceDeanMesajTarih;

    @FindBy(xpath = "//tbody/tr[1]/td[4]")
    public WebElement viceDeanSubject;
}
