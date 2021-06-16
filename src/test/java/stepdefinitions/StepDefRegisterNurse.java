package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefRegisterNurse {
    public static WebDriver webDriver;

    public StepDefRegisterNurse() {
        webDriver = MyWebDriver.getWebDriver();
    }
    @Given("I entered the application with my account.")
    public void iEnteredTheApplicationWithMyAccount() {
        WebElement buttonSideBarRegister = webDriver.findElement(By.id("registrarse"));
        buttonSideBarRegister.click();

        WebElement textEmailInput = webDriver.findElement(By.xpath("/html/body/app-root/app-registrar/div/div[2]/div/div/div/div/form/div[1]/div/input"));
        textEmailInput.click();
        textEmailInput.sendKeys("examplenurrsse@hotmail.com");

        WebElement textPasswordInput = webDriver.findElement(By.xpath("/html/body/app-root/app-registrar/div/div[2]/div/div/div/div/form/div[2]/div/input"));
        textPasswordInput.click();
        textPasswordInput.sendKeys("passwordExample");

        WebElement acceptsterm= webDriver.findElement(By.xpath("//*[@id=\"acceptTerms\"]"));
        acceptsterm.click();

        WebElement buttonCreateAccount = webDriver.findElement(By.id("btnCrearCuenta"));
        buttonCreateAccount.click();
    }

    @When("I select the role nurse and complete the form with my personal data.")
    public void iSelectTheRoleAndCompleteTheFormWithMyPersonalData() {
        //Selecciono el rol "enfermero"
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-seleccion/div/div[2]/div/div[1]/button")))
                .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-form-enfermero/div/div[2]/div/div/div/div/form/div[2]/div[1]/div/input")))
                .sendKeys("Andress Nurse");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-form-enfermero/div/div[2]/div/div/div/div/form/div[2]/div[2]/div/input")))
                .sendKeys("Barranco Nurse");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-form-enfermero/div/div[2]/div/div/div/div/form/div[3]/div[1]/div/div/input")))
                .sendKeys("2000-01-12");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-form-enfermero/div/div[2]/div/div/div/div/form/div[3]/div[2]/div/input")))
                .sendKeys("70245124");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-form-enfermero/div/div[2]/div/div/div/div/form/div[5]/div/div/input")))
                .sendKeys("985424417");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-form-enfermero/div/div[2]/div/div/div/div/form/div[7]/div/div/input")))
                .sendKeys("985424");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-form-enfermero/div/div[2]/div/div/div/div/form/div[8]/div[1]/div/input")))
                .sendKeys("College");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"inputGroupSelect01\"]")))
                .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"inputGroupSelect01\"]/option[4]")))
                .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-form-enfermero/div/div[2]/div/div/div/div/form/div[9]/div/div/textarea")))
                .sendKeys("Any dascriptionajsjasjajsjjdsadasdasd");

    }

    @Then("My data is registered and I have my account with a nurse role to use its specific functionalities for this role.")
    public void myDataIsRegisteredAndIHaveMyAccountWithANurseRoleToUseItsSpecificFunctionalitiesForThisRole() {
        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-form-enfermero/div/div[2]/div/div/div/div/form/div[10]/button")))
                .click();
    }
}
