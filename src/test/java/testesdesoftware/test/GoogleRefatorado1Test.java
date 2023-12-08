package testesdesoftware.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleRefatorado1Test extends BaseTest {
    @Test
    public void pesquisarNoGoogle() {
        //Montagem do cenário
//		iniciar();

        //Preparação
        WebElement inputPesquisa = driver.findElement(By.name("q"));

        //Execução
        inputPesquisa.sendKeys("bolo de laranja" + Keys.ENTER);

        String resultado = driver.findElement(By.id("result-stats")).getText();

        //Verificação e Análise
        assertTrue(resultado, resultado.contains("Aproximadamente"));

//		driver.quit();
    }

}
