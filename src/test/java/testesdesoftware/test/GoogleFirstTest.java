package testesdesoftware.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFirstTest {
    private WebDriver driver;
    private String URL_BASE = "https://www.google.com";
    private String PATH_DRIVE = "src/test/resources/chromedriver.exe";

    private void iniciar() {
        System.setProperty("webdriver.chrome.driver", PATH_DRIVE);
        driver = new ChromeDriver(); //só abre o navegador
        driver.manage().window().maximize(); //maximiza a janela do navegador
        driver.get(URL_BASE); //injeta um endereço no navegador e faz o request
    }

    @Test
    public void pesquisarNoGoogle() {
        //Montagem do cenário
        iniciar();

        //Preparação
        WebElement inputPesquisa = driver.findElement(By.name("q"));

        //Execução
        inputPesquisa.sendKeys("bolo de laranja" + Keys.ENTER);

        String resultado = driver.findElement(By.id("result-stats")).getText();

        //Verificação e Análise
        assertTrue(resultado, resultado.contains("Aproximadamente"));

        driver.quit();
    }

}









