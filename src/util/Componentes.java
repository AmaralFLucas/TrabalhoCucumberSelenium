package util;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Componentes {
    private WebDriver driver;
    private Select combo;

    public void inicializa(){

        String chromeDriver = System.getProperty("user.dir")+"/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///"+System.getProperty("user.dir")+"/driver/componentes.html");

    }

    public void navegador(){

        Assert.assertTrue(driver.toString().contains("Chrome"));

    }

    public void preecherNome(){

        driver.findElement(By.id("elementosForm:nome")).sendKeys("Lucas");

    }

    public void preecherSobrenome(){

        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Farias");

    }

    public void selecionarSexo(){

        driver.findElement(By.id("elementosForm:sexo:0")).click();

    }

    public void comidaFavorita(){

        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();

    }

    public void escolaridade(){
        WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
        combo = new Select(elemento);
        combo.selectByIndex(3);
    }

    public void esporte(){
        WebElement elemento = driver.findElement(By.id("elementosForm:esportes"));
        combo = new Select(elemento);
        combo.selectByIndex(4);
    }

    public void cadastrar(){
        WebElement botaoCadastrar = driver.findElement(By.id("elementosForm:cadastrar"));
        botaoCadastrar.click();
    }

    public void validarCadastro(){
        Assert.assertEquals("Cadastrado!\nNome: Lucas\nSobrenome: Farias\nSexo: Masculino\nComida: Carne\nEscolaridade: 2graucomp" +
                "\nEsportes: O que eh esporte?\nSugestoes:", driver.findElement(By.id("resultado")).getText());

    }

    public void validarMensagemNome() {
        Alert cadastrar = driver.switchTo().alert();
        Assert.assertEquals("Nome eh obrigatorio", cadastrar.getText());
        cadastrar.accept();
    }

    public void validarMensagemSobrenome() {
        Alert cadastrar = driver.switchTo().alert();
        Assert.assertEquals("Sobrenome eh obrigatorio", cadastrar.getText());
        cadastrar.accept();
    }

    public void validarMensagemSexo() {
        Alert cadastrar = driver.switchTo().alert();
        Assert.assertEquals("Sexo eh obrigatorio", cadastrar.getText());
        cadastrar.accept();
    }

    public void testarBotaoCliqueMe(){
        driver.findElement(By.id("buttonSimple")).click();
    }

    public void validarBotaoCliqueMe(){
        Assert.assertEquals("Obrigado!", driver.findElement(By.id("buttonSimple")).getAttribute("value"));
    }

    public void testarBotaoVoltar(){
        WebElement botaoVoltar = driver.findElement(By.xpath("//a[@onclick='javascript:voltou()']"));
        botaoVoltar.click();
    }

    public void validarBotaoVoltar(){
        Assert.assertEquals("Voltou!", driver.findElement(By.id("resultado")).getText());
    }

    public void fecharNavegador(){

        driver.close();

    }
}
