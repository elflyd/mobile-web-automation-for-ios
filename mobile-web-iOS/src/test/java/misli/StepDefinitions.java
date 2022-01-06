package misli;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utility.Hook;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {

    public WebDriver driver;



    public StepDefinitions() {
        this.driver = Hook.getDriver();
    }


    @Given("^Open https://beta.misli.com in Safari browser$")
    public void openHttpsBetaMisliComInSafariBrowser() throws Throwable{
        driver.get("https://beta.misli.az/");
    }

    //Register Scenario:

    @When("Press on Qeydiyyat button")
    public void press_on_qeydiyyat_button() {
        driver.findElement(By.linkText("QEYDİYYAT")).click();
    }

    @And("Enter name and surname")
    public void enter_name_and_surname() throws InterruptedException {

        Thread.sleep(1000);

        driver.findElement(By.xpath("//html[@id='device']//input[@id='firstName']")).click();
        driver.findElement(By.xpath("//html[@id='device']//input[@id='firstName']")).sendKeys("polly");
        driver.findElement(By.xpath("//html[@id='device']//input[@id='lastName']")).click();
        driver.findElement(By.xpath("//html[@id='device']//input[@id='lastName']")).sendKeys("gray");
    }

    @And("Enter birth date and e-mail")
    public void enter_birth_date_and_e_mail() {

        driver.findElement(By.xpath("//html[@id='device']//input[@id='birthDate']")).click();
        driver.findElement(By.xpath("//html[@id='device']//input[@id='birthDate']")).sendKeys("11.01.1994");
        driver.findElement(By.xpath("//html[@id='device']//input[@id='email']")).click();
        driver.findElement(By.xpath("//html[@id='device']//input[@id='email']")).sendKeys("p12@gmail.com");
    }

    @And("Enter password and phone number")
    public void enter_password_and_phone_number() {
        driver.findElement(By.xpath("//html[@id='device']//input[@id='mobileNumber']")).click();
        driver.findElement(By.xpath("//html[@id='device']//input[@id='mobileNumber']")).sendKeys("7773337722");

        driver.findElement(By.xpath("//html[@id='device']//input[@id='password']")).click();
        driver.findElement(By.xpath("//html[@id='device']//input[@id='password']")).sendKeys("mislitest1");

    }

    @And("Accept users agreement")
    public void accept_users_agreement() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='signUpWrapper']/div/div/div/div/div/div/form/div[7]/div/label/div[2]"))
                .click();

        Thread.sleep(5000);
    }

    @Then("Press Qeydiyyatdan kechin button")
    public void press_qeydiyyatdan_kechin_button() {
        driver.findElement(By.xpath(
                        "//html[@id='device']//div[@id='signUpWrapper']/div[@class='container']//form[@class='frmRegister']//button[@type='submit']/span[@class='btn-name']"))
                .click();

    }

    @And("Check entered mobile number")
    public void check_entered_mobile_number() {
        String phnNumber = driver.findElement(By.xpath("//html[@id='device']//input[@id='phoneVerify']")).toString();

        System.out.println("------------------------------------------------------------------");
        System.out.println(phnNumber);
        System.out.println("------------------------------------------------------------------");
    }



    @Then("Press Gonder button")
    public void press_gonder_button() {
        driver.findElement(By.xpath("//div[@id='emptyHeader']/div/div[2]/div/div/div[2]/div/div[2]/form/div[3]/div/button/span")).click();

    }

    @And("Enter OTP code")
    public void enter_otp_code() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//html[@id='device']//div[@id='emptyHeader']/div[@class='empty-header']/div[2]/div/div/div[2]//div[@class='m-body']/form[2]//input[@name='activationCode1']")).click();
        driver.findElement(By.xpath("//html[@id='device']//div[@id='emptyHeader']/div[@class='empty-header']/div[2]/div/div/div[2]//div[@class='m-body']/form[2]//input[@name='activationCode1']")).sendKeys("4");
        driver.findElement(By.xpath("//html[@id='device']//div[@id='emptyHeader']/div[@class='empty-header']/div[2]/div/div/div[2]//div[@class='m-body']/form[2]//input[@name='activationCode2']")).click();
        driver.findElement(By.xpath("//html[@id='device']//div[@id='emptyHeader']/div[@class='empty-header']/div[2]/div/div/div[2]//div[@class='m-body']/form[2]//input[@name='activationCode2']")).sendKeys("9");
        driver.findElement(By.xpath("//html[@id='device']//div[@id='emptyHeader']/div[@class='empty-header']/div[2]/div/div/div[2]//div[@class='m-body']/form[2]//input[@name='activationCode3']")).click();
        driver.findElement(By.xpath("//html[@id='device']//div[@id='emptyHeader']/div[@class='empty-header']/div[2]/div/div/div[2]//div[@class='m-body']/form[2]//input[@name='activationCode3']")).sendKeys("5");
        driver.findElement(By.xpath("//html[@id='device']//div[@id='emptyHeader']/div[@class='empty-header']/div[2]/div/div/div[2]//div[@class='m-body']/form[2]//input[@name='activationCode4']")).click();
        driver.findElement(By.xpath("//html[@id='device']//div[@id='emptyHeader']/div[@class='empty-header']/div[2]/div/div/div[2]//div[@class='m-body']/form[2]//input[@name='activationCode4']")).sendKeys("3");

    }


    @Then("Press ENTER button")
    public void press_enter_button() {
        driver.findElement(By.xpath("//html[@id='device']//div[@id='emptyHeader']/div[@class='empty-header']/div[2]/div/div/div[2]//div[@class='m-body']/form[2]//button[@type='submit']/span[@class='btn-name']")).click();

        driver.findElement(By.linkText("ANA SƏHİFƏYƏ QAYIT")).click();
    }



    //Login Scenarios:
    @And("^Click on Daxil Ol button$")
    public void click_on_daxil_ol_button() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.linkText("DAXİL OL")).click();
    }

    @When("Enter correct phoneNumber and password")
    public void enterCorrectPhoneNumberAndPassword() throws InterruptedException {
        Thread.sleep(2000);

        driver.findElement(By.xpath("//html[@id='device']//input[@id='username']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//html[@id='device']//input[@id='username']")).sendKeys("7773331111");

        driver.findElement(By.xpath("//html[@id='device']//input[@id='password']")).click();
        driver.findElement(By.xpath("//html[@id='device']//input[@id='password']"))
                .clear();
        driver.findElement(By.xpath("//html[@id='device']//input[@id='password']")).sendKeys("mislitest1");

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @And("^Click on login button$")
    public void click_on_login_button() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("^Check result$")
    public void check_result() {
        Assert.assertTrue((driver.findElement(By.xpath("//html[@id='device']//div[@id='misli-app']/header[@class='header']/div[@class='header-top']/div[@class='container']//div[@class='userInfoWrapper']/span")).isDisplayed()));// Profilim field is displayed

    }

    @When("Enter incorrect phoneNumber and password")
    public void IncorrectPhoneNumberAndPassword() throws InterruptedException {
        Thread.sleep(2000);

        driver.findElement(By.xpath("//html[@id='device']//input[@id='username']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//html[@id='device']//input[@id='username']"))
                .clear();
        driver.findElement(By.xpath("//html[@id='device']//input[@id='username']")).sendKeys("5555555555");

        driver.findElement(By.xpath("//html[@id='device']//input[@id='password']")).click();
        driver.findElement(By.xpath("//html[@id='device']//input[@id='password']"))
                .clear();
        driver.findElement(By.xpath("//html[@id='device']//input[@id='password']")).sendKeys("xxxxxxxxxx");

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }
    @Then("^Check result1$")
    public void check_result1() throws InterruptedException {
        Thread.sleep(1000);

        String alert = driver.findElement(By.xpath(
                "//html[@id='device']//div[@id='m-login']/div/div[2]//form[@class='frmLogin row']//div[@class='alert alert-danger']")).getText();
        String sal = alert.substring(0,7);



        Assert.assertEquals(sal,"Uğursuz");  // Error is displayed

    }

    //Forgot Password Scenarios:

    @And("Click on Şifrəni unutmusunuz?")
    public void clickOnŞifrəniUnutmusunuz() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.linkText(
                "Şifrəni unutmusunuz?")).click();
    }

    @When("Enter phoneNumber and birthDate")
    public void enterPhoneNumberAndBirthDate() throws InterruptedException {
        Thread.sleep(2000);

        driver.findElement(By.xpath("//html[@id='device']//input[@id='reset_userName']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//html[@id='device']//input[@id='reset_userName']"))
                .clear();
        driver.findElement(By.xpath("//html[@id='device']//input[@id='reset_userName']")).sendKeys("5301573960");

        driver.findElement(By.xpath("//html[@id='device']//input[@id='reset_birthDate']")).click();
        driver.findElement(By.xpath("//html[@id='device']//input[@id='reset_birthDate']"))
                .clear();
        driver.findElement(By.xpath("//html[@id='device']//input[@id='reset_birthDate']")).sendKeys("21072000");
        driver.findElement(By.xpath("//html[@id='device']//input[@id='reset_birthDate']")).sendKeys(Keys.chord(Keys.ENTER));

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    }
    @And("Click on DAVAM ET")
    public void clickOnDAVAMET() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath(
                "//*[@id='m-forgot-password']/div/div[2]/div/div[3]/form/div[5]/button/span")).click();
    }
    @And("Click on DAVAM ET 2")
    public void clickOnDAVAMET2() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath(
                "//*[@id='modalUserMaskedMobileAndEmail']/div/div[2]/div/div[2]/form/button")).click();
    }

    @Then("^Check email/sms pop-up$")
    public void checkEmailSmsPopUp() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue((driver.findElement(By.xpath(
                "//*[@id='modalUserMaskedMobileAndEmail']/div/div[2]/div/div[2]/div")).isDisplayed()));// pop-up is displayed
    }
    @And("^Click e-mail button$")
    public void click_email_button() {
        driver.findElement(By.xpath("//*[@id='maskedEmail']")).click();
    }

    @And("^Click sms button$")
    public void click_sms_button() {
        driver.findElement(By.xpath("//*[@id='maskedMobileNo']")).click();
    }

    @Then("^Check result of Code Sent$")
    public void codeSent() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue((driver.findElement(By.xpath(
                "//*[@id='misli-app']/div[3]/div/div/div[2]/div/div[2]/div/span")).isDisplayed()));
    }
}

