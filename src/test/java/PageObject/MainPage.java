package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends AbstractPage
{
    /**
     * Init
     * @param driver
     */
    public MainPage(WebDriver driver)
    {
        super(driver);
    }

    /**
     * Idź do strony głównej
     * @return
     */
    public MainPage NavigateToMain() {
        driver.navigate().to(srodowisko);
        return this;
    }

    public MainPage ZamknijPopupNaGlownej()
    {
        driver.findElement(By.xpath("//body[@id='frameworkbundle_template']/div[4]/div/div/div/div[2]/button")).click();
        return this;
    }

    /**
     * Idź do strony logowania
     * @return
     */
    public LoginPage KlikniecieNaLinkZalogujSie() {
        driver.findElement(By.xpath("//div[@class='text hidden-sm'][contains(text(),'Zaloguj się')]")).click();
        return new LoginPage(driver);
    }





}
