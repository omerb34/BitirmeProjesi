package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherManagementPage {
    public TeacherManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menuButton;

    @FindBy(xpath = "//*[text()='Teacher Management']")
    public WebElement teacherManagement;
    @FindBy(xpath = "//*[@class=' css-13cymwt-control']")
    //@FindBy(id = "//*[@id='react-select-5-placeholder']")
    //@FindBy(xpath="//*[@class=' css-b62m3t-container']")
    //@FindBy(xpath = "//*[@class=' css-1fdsijx-ValueContainer']")
    //@FindBy(xpath = "//*[@id='react-select-3-input']")
    public WebElement chooseLessonDropdown;
//    @FindBy(xpath="//*[@class=' css-b62m3t-container']")
//    public WebElement chooseLessons;
//pages.teacherManagementSayfasi().chooseLessons.click();
//ReusableMethods.waitFor(1);
//    Actions action = new Actions(Driver.getDriver());
//action.keyDown(Keys.ARROW_DOWN).sendKeys("Math").perform();
//Driver.wait(4);
//action.sendKeys(Keys.ENTER).perform();

    @FindBy(xpath = "//*[@placeholder=\"Name\"]")
    public WebElement name;

    @FindBy(xpath = "//*[@placeholder=\"Surname\"]")
    public WebElement surname;

    @FindBy(xpath = "//*[@placeholder=\"Birth Place\"]")
    public WebElement birthPlace;

    @FindBy(xpath = "//*[@placeholder=\"Email Address\"]")
    public WebElement mailAdress;

    @FindBy(xpath = "//*[@placeholder=\"Phone Number\"]")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@id='isAdvisorTeacher']")
    public WebElement isAdvisorCheckBox;

    @FindBy(xpath = "//*[@value='FEMALE']")
    public WebElement genderCheckBox;

    @FindBy(xpath = "//*[@id='birthDay']")
    public WebElement birthdayDate;

    @FindBy(xpath = "//*[@placeholder='ssn']")
    public WebElement Ssn;

    @FindBy(xpath = "//*[@placeholder='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submit;










    }

