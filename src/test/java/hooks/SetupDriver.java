package hooks;

import common.BrowserFactory;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class SetupDriver {

    public static WebDriver driver;

    @Before
    public void setDriver() {
        String browser = System.getProperty("browser");
        if (browser == null) {
            browser = "chrome";
        }
        driver = BrowserFactory.getBrowser(browser);
    }


}
