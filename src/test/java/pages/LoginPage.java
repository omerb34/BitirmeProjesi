package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public  LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = " //*[@class ='header_link ms-2']")
    public WebElement anasayfaLogin;

    @FindBy(xpath = " //*[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//*[@class=\"fw-semibold btn btn-primary\"]")
    public WebElement sonLogin;

    @FindBy(xpath = " //*[@class=\"text-white\"]")
    public WebElement girisDogrulama;

    @FindBy(xpath = "//*[.='Menu']")
    public WebElement menu;

    @FindBy(xpath = "//*[.='Contact Get All']")
    public WebElement contactGetAll;

    @FindBy(xpath = "//*[.='Contact Message']")
    public WebElement contactMessageHeader;

    @FindBy(xpath = "(//table//tr//th)[5]")
    public WebElement messageKutusu;

    @FindBy(xpath = "(//tbody//tr//td[5])[1]")
    public WebElement messajIcerik;

    @FindBy(xpath = " (//table//tr/th)[1]")
    public WebElement NameKutusu;

    @FindBy(xpath = "(//tbody/tr//td[1])[1]")
    public WebElement nameIcerik;

    @FindBy(xpath = "(//table//tr/th)[2]")
    public WebElement emailKutusu;

    @FindBy(xpath = "(//tbody/tr//td[2])[1]")
    public WebElement emailIcerik;

    @FindBy(xpath = "(//table//tr/th)[2]")
    public WebElement subjectKutusu;

    @FindBy(xpath = "(//tbody/tr//td[4])[1]")
    public WebElement subjectIcerik;

    @FindBy(xpath = "(//table//tr/th)[3]")
    public WebElement dateKutusu;

    @FindBy(xpath = "(//tbody/tr//td[3])[1]")
    public WebElement dateIcerik;














}
