package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage{

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    public void imOnLoginPage() {
        driver.navigate().to(srodowisko + "login");

    }
    public void insertLogin(String username) {
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys(username);

    }
    public LoginPage insertPassword(String password) {
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
        return this;
    }
    public LoginPage submit() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        return this;
    }
    public void logged(){
        String url = driver.getCurrentUrl();
        Assert.assertEquals(srodowisko,url);
    }
    public void noLogged(){
        String url = driver.getCurrentUrl();
        Assert.assertEquals(srodowisko + "login" ,url);
    }



}
