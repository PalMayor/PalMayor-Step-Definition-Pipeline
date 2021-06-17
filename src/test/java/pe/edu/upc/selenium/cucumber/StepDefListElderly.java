package pe.edu.upc.selenium.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pe.edu.upc.selenium.MyWebDriver;

public class StepDefListElderly {
    public static WebDriver webDriver;

    public StepDefListElderly() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @Given("I registered my seniors")
    public void iRegisteredMySeniors() {
        //Login
        WebElement buttonSignUp = webDriver.findElement(By.xpath("//*[@id=\"login\"]"));
        buttonSignUp.click();

        WebElement textInputEmail = webDriver.findElement(By.xpath("/html/body/app-root/app-iniciar-sesion/div/div[2]/div/div/div[1]/div/form/div[1]/div/input"));
        textInputEmail.sendKeys("example@outlook.com");

        WebElement textInputPassword = webDriver.findElement(By.xpath("/html/body/app-root/app-iniciar-sesion/div/div[2]/div/div/div[1]/div/form/div[2]/div/input"));
            textInputPassword.sendKeys("passwordExample");

        WebElement buttonLogin = webDriver.findElement(By.id("iniciarSesion"));
        buttonLogin.click();

        //Register senior
        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul[1]/li[2]/a")))
                .click();
        WebElement buttonNewOlderAdults = webDriver.findElement(By.xpath("/html/body/app-root/app-familiar-layout/div/app-listar-anciano/div[1]/div/div/div/a"));
        buttonNewOlderAdults.click();

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

    @When("I selected the option to list older adults")
    public void iSelectedTheOptionToListOlderAdults() {
        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul[1]/li[2]/a")))
                .click();
    }

    @Then("the list of my seniors will be displayed")
    public void theListOfMySeniorsWillBeDisplayed() {
        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul[1]/li[2]/a")))
                .click();
    }
}
