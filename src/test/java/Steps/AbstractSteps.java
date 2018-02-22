package Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class AbstractSteps {
    protected static WebDriver driver;

    public AbstractSteps() {
        System.setProperty("webdriver.chrome.driver", "C://Biblioteki Selenium/chrome/chromedriver.exe");

        if(AbstractSteps.driver == null) {
            AbstractSteps.driver = new ChromeDriver();
            //System.out.println("nowa instancja");
        } else {
            //System.out.println("stara instancja");
        }
    }



}
