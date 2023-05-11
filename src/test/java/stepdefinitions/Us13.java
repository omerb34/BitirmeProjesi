package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPageFatih;
import pages.TeacherManagementPage;
import utilities.Driver;

import java.util.Random;

public class Us13 {
    LoginPageFatih loginPageFatih = new LoginPageFatih();
    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();
    Faker faker = new Faker();


    @Given("login as a vice dean")
    public void login_as_a_vice_dean() {
        loginPageFatih.loginButton.click();
        loginPageFatih.username.sendKeys("Batshuayi");
        loginPageFatih.password.sendKeys("12345678");
        loginPageFatih.lastLogin.click();
        teacherManagementPage.menuButton.click();
        teacherManagementPage.teacherManagement.click();
        Driver.wait(3);

    }

    @Then("choose a lesson in dropdown of lessons")
    public void choose_a_lesson_in_dropdown_of_lessons() throws InterruptedException {
        teacherManagementPage.chooseLessonDropdown.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.ARROW_DOWN).sendKeys("JAVA").perform();
        Driver.wait(3);
        actions.sendKeys(Keys.ENTER).perform();
        Driver.wait(3);

        //pages.teacherManagementSayfasi().chooseLessons.click();
//ReusableMethods.waitFor(1);
//    Actions action = new Actions(Driver.getDriver());
//action.keyDown(Keys.ARROW_DOWN).sendKeys("Math").perform();
//Driver.wait(4);
//action.sendKeys(Keys.ENTER).perform();

    }

    @Then("fill in name and surname")
    public void fill_in_name_and_surname() {
        teacherManagementPage.name.sendKeys(faker.name().name());
        teacherManagementPage.surname.sendKeys(faker.name().lastName());

    }

    @Then("fill in birth place")
    public void fill_in_birth_place() {
        teacherManagementPage.birthPlace.sendKeys(faker.address().cityName());
    }

    @Then("fill in mailBox and phoneBox")
    public void fill_in_mail_box_and_phone_box() {
        teacherManagementPage.mailAdress.sendKeys(faker.internet().emailAddress());
        teacherManagementPage.phoneNumber.sendKeys(generatePhoneNumber());
        Driver.wait(3);

    }

    @Then("select gender")
    public void select_gender() {
        teacherManagementPage.isAdvisorCheckBox.click();
        teacherManagementPage.genderCheckBox.click();

    }

    @Then("fill in date of birth")
    public void fill_in_date_of_birth() {
        teacherManagementPage.birthdayDate.sendKeys("12.10.1985");
    }

    @Then("fill ssn, username and password")
    public void fill_ssn_username_and_password() throws InterruptedException {
        teacherManagementPage.Ssn.sendKeys(generateSSN());
        teacherManagementPage.username.sendKeys(faker.name().username());
        teacherManagementPage.password.sendKeys("12345678");
        Thread.sleep(4000);

    }

    @Then("click submit buton")
    public void click_submit_buton() {
        teacherManagementPage.submit.click();
    }

    @Then("validate of teacher which is viceDean created")
    public void validate_of_teacher_which_is_vice_dean_created() {

    }

    @Given("user go the {string}")
    public void userGoThe(String arg0) throws InterruptedException {
        Driver.getDriver().get("http://139.59.159.36:3000/");
        Thread.sleep(3000);
    }

    @Given("user click login")
    public void userClickLogin() {
        loginPageFatih.loginButton.click();
    }

    public static String generateSSN() {
        String ssn = "";
        Random random = new Random();
        int firstThreeDigits = random.nextInt(899) + 100;
        ssn += Integer.toString(firstThreeDigits);
        ssn += "-";
        int nextTwoDigits = random.nextInt(89) + 10;
        ssn += Integer.toString(nextTwoDigits);
        ssn += "-";
        int lastFourDigits = random.nextInt(8999) + 1000;
        ssn += Integer.toString(lastFourDigits);
        return ssn;
    }

    public static String generatePhoneNumber() {
        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            phoneNumber.append(random.nextInt(10));
        }
        phoneNumber.insert(3, "-").insert(7, "-");
        return phoneNumber.toString();
    }
}