package pe.edu.upc.selenium.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pe.edu.upc.selenium.MyWebDriver;

import java.util.concurrent.TimeUnit;


public class SteepsDefRegisterFamily {
    public static WebDriver webDriver;

    public SteepsDefRegisterFamily() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @Given("I entered the application with my account")
    public void iEnteredTheApplicationWithMyAccount() {
        WebElement buttonSideBarRegister = webDriver.findElement(By.id("registrarse"));
        buttonSideBarRegister.click();

        WebElement textEmailInput = webDriver.findElement(By.xpath("/html/body/app-root/app-registrar/div/div[2]/div/div/div/div/form/div[1]/div/input"));
        textEmailInput.click();
        textEmailInput.sendKeys("examplaaae2222@hotsdamail.com");

        WebElement textPasswordInput = webDriver.findElement(By.xpath("/html/body/app-root/app-registrar/div/div[2]/div/div/div/div/form/div[2]/div/input"));
        textPasswordInput.click();
        textPasswordInput.sendKeys("passwordExample");

        WebElement acceptsterm= webDriver.findElement(By.xpath("//*[@id=\"acceptTerms\"]"));
        acceptsterm.click();

        WebElement buttonCreateAccount = webDriver.findElement(By.id("btnCrearCuenta"));
        buttonCreateAccount.click();
    }

    @When("I select the role family and complete the form with my personal data")
    public void iSelectTheRoleAndCompleteTheFormWithMyPersonalData() {
        //Selecciono el rol "familiar"
        WebDriverWait wait = new WebDriverWait(webDriver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-seleccion/div/div[1]/div/div[2]/button")))
                .click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-form-familiar/div/div[2]/div/div/div/div/form/div[2]/div[1]/div/input")))
                .sendKeys("Andress");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-form-familiar/div/div[2]/div/div/div/div/form/div[2]/div[2]/div/input")))
                .sendKeys("Barranco Prades");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-form-familiar/div/div[2]/div/div/div/div/form/div[3]/div[1]/div/div/input")))
                .sendKeys("2000-01-12");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-form-familiar/div/div[2]/div/div/div/div/form/div[3]/div[2]/div/input")))
                .sendKeys("70245124");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-form-familiar/div/div[2]/div/div/div/div/form/div[5]/div/div/input")))
                .sendKeys("985424417");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-form-familiar/div/div[2]/div/div/div/div/form/div[4]/div[3]/div/div")))
                .click();
    }

    @Then("My data is recorded and I have my account with a relative role to make use of its specific functionalities for this role")
    public void myDataIsRecordedAndIHaveMyAccountWithARelativeRoleToMakeUseOfItsSpecificFunctionalitiesForThisRole() {
        WebDriverWait wait = new WebDriverWait(webDriver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-form-familiar/div/div[2]/div/div/div/div/form/div[6]/button")))
                .click();
    }

}
