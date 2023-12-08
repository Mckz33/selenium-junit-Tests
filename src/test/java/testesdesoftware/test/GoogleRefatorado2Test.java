package testesdesoftware.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import tesetsdesoftware.pageObject.GooglePO;

public class GoogleRefatorado2Test extends BaseTest {
	
	private static GooglePO googlePage;
	
	@BeforeClass
	public static void prepararTest() {
		driver.get("https://www.google.com");
		googlePage = new GooglePO(driver);
	}
	
	@Test
	public void pesquisarNoGoogle() {
//		//Montagem do cenário
////		iniciar();
//		
//		//Preparação
//		WebElement inputPesquisa = driver.findElement(By.name("q"));
//		
//		//Execução
//		inputPesquisa.sendKeys("bolo de laranja" + Keys.ENTER);
		
		googlePage.inputPesquisa.sendKeys("bolo de laranja" + Keys.ENTER);
		
//		String resultado = driver.findElement(By.id("result-stats")).getText();
		String resultado = googlePage.divResultadoPesquisa.getText();
		
		//Verificação e Análise
		assertTrue(resultado, resultado.contains("Aproximadamente"));
		
//		driver.quit();
	}
	
	@Test
	public void pesquisarNoGoogle2() {
		googlePage.inputPesquisa.sendKeys("bolo de banana" + Keys.ENTER);
		
		String resultado = googlePage.divResultadoPesquisa.getText();
		
		assertTrue(resultado, resultado.contains("resultados"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
