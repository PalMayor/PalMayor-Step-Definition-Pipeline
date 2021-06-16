package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefRegisterElderly {

    public static WebDriver webDriver;

    public StepDefRegisterElderly() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @Given("I entered the application")
    public void iEnteredTheApplication() {
        //Login
        WebElement buttonSignUp = webDriver.findElement(By.xpath("//*[@id=\"login\"]"));
        buttonSignUp.click();

        WebElement textInputEmail = webDriver.findElement(By.xpath("/html/body/app-root/app-iniciar-sesion/div/div[2]/div/div/div[1]/div/form/div[1]/div/input"));
        textInputEmail.sendKeys("examplaaae222@hotsdamail.com");

        WebElement textInputPassword = webDriver.findElement(By.xpath("/html/body/app-root/app-iniciar-sesion/div/div[2]/div/div/div[1]/div/form/div[2]/div/input"));
        textInputPassword.sendKeys("passwordExample");

        WebElement buttonLogin = webDriver.findElement(By.id("iniciarSesion"));
        buttonLogin.click();
    }

    @When("Select the option to register my senior")
    public void selectTheOptionToRegisterMySenior() {
        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul[1]/li[2]/a")))
                .click();
        WebElement buttonNewOlderAdults = webDriver.findElement(By.xpath("/html/body/app-root/app-familiar-layout/div/app-listar-anciano/div[1]/div/div/div/a"));
        buttonNewOlderAdults.click();
    }

    @Then("The form for the registration of the elderly will be displayed")
    public void theFormForTheRegistrationOfTheElderlyWillBeDisplayed() {
        //Form of new older adult
        WebElement nameOfNewOlderAdult = webDriver.findElement(By.xpath("/html/body/app-root/app-familiar-layout/div/app-form-anciano/div[2]/div/div/div/div[3]/form/div[1]/div[1]/div[1]/div/input"));
        nameOfNewOlderAdult.sendKeys("Jorge Clerk");
        WebElement lastNameOfNewOlderAdult = webDriver.findElement(By.xpath("/html/body/app-root/app-familiar-layout/div/app-form-anciano/div[2]/div/div/div/div[3]/form/div[1]/div[1]/div[2]/div/input"));
        lastNameOfNewOlderAdult.sendKeys("White Vleck");
        WebElement dateOfBirthday = webDriver.findElement(By.xpath("/html/body/app-root/app-familiar-layout/div/app-form-anciano/div[2]/div/div/div/div[3]/form/div[1]/div[2]/div[1]/div/div/input"));
        dateOfBirthday.sendKeys("1952-06-24");
        WebElement dniInputText = webDriver.findElement(By.xpath("/html/body/app-root/app-familiar-layout/div/app-form-anciano/div[2]/div/div/div/div[3]/form/div[1]/div[2]/div[2]/div[1]/input"));
        dniInputText.sendKeys("19520624");
        WebElement genderInput = webDriver.findElement(By.xpath("/html/body/app-root/app-familiar-layout/div/app-form-anciano/div[2]/div/div/div/div[3]/form/div[1]/div[3]/div[3]/div/div/label"));
        genderInput.click();

        WebElement enterNewOlderAdult = webDriver.findElement(By.xpath("/html/body/app-root/app-familiar-layout/div/app-form-anciano/div[2]/div/div/div/div[3]/form/div[3]/button"));
        enterNewOlderAdult.click();
    }
}
