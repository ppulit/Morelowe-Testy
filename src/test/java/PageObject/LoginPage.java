package PageObject;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage{

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    public LoginPage imOnLoginPage() {
        driver.navigate().to(srodowisko + "login");
        return this;
    }
    public LoginPage insertLogin(String username) {
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys(username);
        return this;
    }
    public LoginPage insertPassword(String password) {
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
        return this;
    }
    public MainPage submit() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        return new MainPage(driver);
    }
    public void logged(){
        String url = driver.getCurrentUrl();
        Assert.assertEquals(srodowisko,url);
    }
    public void noLogged(){
        String url = driver.getCurrentUrl();
        Assert.assertEquals(srodowisko + "login" ,url);
    }

    public void alertText() throws InterruptedException {
        driver.findElement(By.xpath(".//*[@id='login']//*[text()='Nieprawidłowy e-mail lub hasło']"));
    }



}
