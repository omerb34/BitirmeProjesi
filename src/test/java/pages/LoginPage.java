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








}
