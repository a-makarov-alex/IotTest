package pages;

import hooks.SetupDriver;
import hooks.Wait;
import org.openqa.selenium.WebDriver;

import java.util.function.Function;

public class BasePage {

    protected WebDriver webDriver;
    protected Wait wait;

    public BasePage() {
        this.webDriver = SetupDriver.driver;
        this.wait = new Wait(this.webDriver);
    }
}
