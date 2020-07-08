package hooks;

import common.BrowserFactory;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetupDriver {

    public static WebDriver driver;

    @Before
    public void setDriver() {
        String browser = System.getProperty("browser");
        if (browser == null) {
            System.out.println("NULL PROPERTY CHANGED TO CHROME");
            browser = "chrome";
        }

        driver = BrowserFactory.getBrowser(browser);

        /*switch (browser) {
            case "chrome" : {
                System.out.println("CHROME FOUND");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("['start-maximized']");
                driver = new ChromeDriver(chromeOptions);
                break;

            }
            case "firefox" : {
                System.out.println("FIREFOX FOUND");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;
            }
            default : {
                throw new IllegalArgumentException("Browser \"" + browser + "\" isn't supported.");
            }
        }*/
    }


}
