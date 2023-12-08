package testesdesoftware.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import tesetsdesoftware.pageObject.LoginPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest extends BaseTest {

    private static LoginPO loginPage;

    @BeforeClass
    public static void prepararTestes() {
        loginPage = new LoginPO(driver);
    }

    @Test
    public void TC001_naoDeveLogarNoSistemaComEmailESenhaVazios() {
//		loginPage.inputEmail.sendKeys("");
//		loginPage.inputSenha.sendKeys("");
//		loginPage.buttonEntrar.click();

        loginPage.executarAcaoDeLogar("", "");

        String mensagem = loginPage.obterMensagem();

        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
    }

    @Test
    public void TC002_naoDeveLogarNoSistemaComSenhaVazio() {
//		loginPage.inputEmail.sendKeys("");
//		loginPage.inputSenha.sendKeys("");
//		loginPage.buttonEntrar.click();

        loginPage.executarAcaoDeLogar("teste", "");

        String mensagem = loginPage.obterMensagem();

        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
    }

    @Test
    public void TC003_naoDeveLogarNoSistemaComEmailVazio() {
//		loginPage.inputEmail.sendKeys("");
//		loginPage.inputSenha.sendKeys("");
//		loginPage.buttonEntrar.click();

        loginPage.executarAcaoDeLogar("", "teste");

        String mensagem = loginPage.obterMensagem();

        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
    }

    @Test
    public void TC004_naoDeveLogarNoSistemaComEmailESenhaErrados() {
//		loginPage.inputEmail.sendKeys("");
//		loginPage.inputSenha.sendKeys("");
//		loginPage.buttonEntrar.click();

        loginPage.executarAcaoDeLogar("teste", "teste");

        String mensagem = loginPage.obterMensagem();

        assertEquals(mensagem, "E-mail ou senha inválidos");
    }

    @Test
    public void TC005_naoDeveLogarNoSistemaComEmailErradoESenhaCorreta() {
//		loginPage.inputEmail.sendKeys("");
//		loginPage.inputSenha.sendKeys("");
//		loginPage.buttonEntrar.click();

        loginPage.executarAcaoDeLogar("teste", "admin@123");

        String mensagem = loginPage.obterMensagem();

        assertEquals(mensagem, "E-mail ou senha inválidos");
    }

    @Test
    public void TC006_deveLogarNoSistemaComEmailESenhaCorreta() {
//		loginPage.inputEmail.sendKeys("");
//		loginPage.inputSenha.sendKeys("");
//		loginPage.buttonEntrar.click();

        loginPage.executarAcaoDeLogar("admin@admin.com", "admin@123");

//        String mensagem = loginPage.obterMensagem();
//
//        assertEquals(mensagem, "E-mail ou senha inválidos");
    }

}
