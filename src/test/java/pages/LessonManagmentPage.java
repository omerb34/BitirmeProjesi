package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class LessonManagmentPage {
    public LessonManagmentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[.='Lesson Management'])[4]")
    public WebElement lessonManagment;

    @FindBy(xpath = "(//*[.='Lesson Management'])[2]")
    public WebElement lessonManagmentDogrulama;

    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tab-lessonsList\"]")
    public WebElement lessons;

    @FindBy(xpath = "//*[@id=\"lessonName\"]")
    public WebElement lessonName;

    @FindBy(xpath = "(//*[@class=\"invalid-feedback\"])[4]")
    public WebElement requiredLessonName;

    @FindBy(xpath = "//*[@id=\"creditScore\"]")
    public WebElement creditScore;

    @FindBy(xpath = "(//*[@class=\"invalid-feedback\"])[5]")
    public WebElement requiredCreditScore;

    @FindBy(xpath = "(//*[@class=\"fw-semibold btn btn-primary btn-lg\"])[2]")
    public WebElement submit;

    @FindBy(xpath = "(//*[.='Lesson Name'])[4]")
    public List<WebElement> derslerlist;

    @FindBy(xpath = "(//*[.='Lesson Created'])[3]")
    public WebElement lessonCreated;








}
