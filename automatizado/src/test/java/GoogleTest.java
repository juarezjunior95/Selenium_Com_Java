import static org.junit.Assert.assertTrue;

import java.net.URL;
import java.security.Key;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    private WebDriver driver;
    private final String  URL_BASE = "https://www.google.com/";
    private final String  CAMINHO_DRIVER= "automatizado/Resources/chromedriver.exe";

    private void iniciar(){
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }
    @Test
    public void PesquisarnoGoogle(){
        iniciar();
           WebElement inputPEsquisa = driver.findElement(By.name("q"));
           inputPEsquisa.sendKeys("Linkedin" + Keys.ENTER);

          String Resultado = driver.findElement(By.id("result-stats")).getText();
          
          assertTrue(Resultado, Resultado.contains("Aproximadamente"));
        
          driver.quit();
    }

}
