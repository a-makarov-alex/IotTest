package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class TearDown {
    private WebDriver driver;

    public TearDown() {
        this.driver = SetupDriver.driver;
    }

    @After
    public void quitDriver(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("SCENARIO " + scenario.getName() + " IS FAILED");
        }
        this.driver.quit();
    }
}
