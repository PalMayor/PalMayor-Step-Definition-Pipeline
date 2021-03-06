package pe.edu.upc.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyWebDriver {
    public static WebDriver webDriver;

    private MyWebDriver() {

    }
    public static WebDriver getWebDriver() {
        String urlPage = "http://localhost:4200/#/landing";
        if(webDriver == null) {

            // Establece el chrome driver
            //WebDriver webDriver;
            String pathDriver = System.getProperty("user.dir") + "\\driver\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", pathDriver);
            webDriver = new ChromeDriver();

            // Carga la pagina
            webDriver.get(urlPage);

            // --Maximiza la ventana
            webDriver.manage().window().maximize();

            
        }else {
            webDriver.get(urlPage);
        }
        return webDriver;
    }

}
