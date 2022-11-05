package br.com.mercadolivre.pages;


import br.com.mercadolivre.util.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class BasePages extends Elements {

    // Método de clicar
    public static void click(By by) {
        waitElement(by);
        element(by).click();
    }

    // Método de escrever em campo
    public static void sendKeys(By by, String texto) {
        waitElement(by);
        element(by).sendKeys(texto);
    }

    // Método de pegar um texto na tela
    public static String lerText(By by){
        waitElement(by);
        return element(by).getText();
    }
    // Método de limpar campo

    public void limparCampo(By by){
        for(int i = 0; i < 20; i++) {
            element(by).sendKeys(Keys.BACK_SPACE);
        }
    }

    public void tecla(By by ,Keys tecla){
        waitElement(by);
        element(by).sendKeys(tecla);
    }

    // Método para pegar um elemento
   /* public static WebElement element(By by){
        return driver.findElement(by);
    }

    // Metodo para esperar um elemento
    /*public static void waitElement(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }*/

}
