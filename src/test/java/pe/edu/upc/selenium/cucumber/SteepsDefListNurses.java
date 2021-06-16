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

public class SteepsDefListNurses {
    public static WebDriver webDriver;

    public SteepsDefListNurses() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @Given("I registered the offer")
    public void iRegisteredTheOffer() {
        //Login
        WebElement buttonSignUp = webDriver.findElement(By.xpath("//*[@id=\"login\"]"));
        buttonSignUp.click();

        WebElement textInputEmail = webDriver.findElement(By.xpath("/html/body/app-root/app-iniciar-sesion/div/div[2]/div/div/div[1]/div/form/div[1]/div/input"));
        textInputEmail.sendKeys("examplaaae222@hotsdamail.com");

        WebElement textInputPassword = webDriver.findElement(By.xpath("/html/body/app-root/app-iniciar-sesion/div/div[2]/div/div/div[1]/div/form/div[2]/div/input"));
        textInputPassword.sendKeys("passwordExample");

        WebElement buttonLogin = webDriver.findElement(By.id("iniciarSesion"));
        buttonLogin.click();

        //button create new offer
        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-familiar-layout/div/app-familiar-dashboard/app-listar-ofertas/div[1]/div/div/div/a")))
                .click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"selectAnciano\"]")))
                .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"selectAnciano\"]/option[2]")))
                .click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"selectHorasInicio\"]")))
                .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"selectHorasInicio\"]/option[2]")))
                .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"selectPeriodoInicio\"]")))
                .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"selectPeriodoInicio\"]/option[2]")))
                .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"selectHorasFin\"]")))
                .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"selectHorasFin\"]/option[7]")))
                .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"selectPeriodoFin\"]")))
                .click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"selectPeriodoFin\"]/option[2]")))
                .click();
        //Input date
        WebElement inputDateStart = webDriver.findElement(By.xpath("/html/body/app-root/app-familiar-layout/div/app-registrar-oferta/div[2]/div/div/div[1]/div[2]/form/div[2]/div[5]/div[1]/div/div/input"));
        inputDateStart.sendKeys("2021-06-16");

        WebElement inputDateFinish = webDriver.findElement(By.xpath("/html/body/app-root/app-familiar-layout/div/app-registrar-oferta/div[2]/div/div/div[1]/div[2]/form/div[2]/div[5]/div[2]/div/div/input"));
        inputDateFinish.sendKeys("2021-06-27");

        //Input address
        WebElement inputAddress = webDriver.findElement(By.xpath("//*[@id=\"input-direccion\"]"));
        inputAddress.sendKeys("Any address");

        //Input detail
        WebElement inputDetail = webDriver.findElement(By.xpath("/html/body/app-root/app-familiar-layout/div/app-registrar-oferta/div[2]/div/div/div[1]/div[2]/form/div[2]/div[7]/div/div/textarea"));
        inputDetail.sendKeys("Any Detail");
        //Button Enter offer
        WebElement buttonEnterOffer = webDriver.findElement(By.xpath("/html/body/app-root/app-familiar-layout/div/app-registrar-oferta/div[2]/div/div/div[1]/div[2]/form/div[3]/button"));
        buttonEnterOffer.click();
    }

    @When("I want to list the nurses of the offer")
    public void iWantToListTheNursesOfTheOffer() {
        webDriver.get("http://localhost:4200/#/fm-dashboard");
    }

    @Then("A list of Nurses applying for the offer will be displayed")
    public void aListOfNursesApplyingForTheOfferWillBeDisplayed() {
        WebElement buttonDashboard = webDriver.findElement(By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul[1]/li[1]/a"));
        buttonDashboard.click();
    }
}
