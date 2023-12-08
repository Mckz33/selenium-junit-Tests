package testesdesoftware.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    //	private static final String URL_BASE = "https://www.google.com";
    private static final String URL_BASE = "file:///C:/Users/sopi_/Downloads/material_ultima_aula_teste_01DEZ23/sistema/sistema/login.html";
    private static final String PATH_DRIVE = "src/test/resources/chromedriver120.0.6099.exe";
    protected static WebDriver driver;

    @BeforeClass
    public static void iniciar() {
        System.setProperty("webdriver.chrome.driver", PATH_DRIVE);
        driver = new ChromeDriver(); //só abre o navegador
        driver.manage().window().maximize(); //maximiza a janela do navegador
        driver.get(URL_BASE); //injeta um endereço no navegador e faz o request
    }

    @AfterClass
    public static void finalizar() {
        driver.quit();
    }

}
