package ui_tests.pages;

import ui_tests.hooks.SetupDriver;
import ui_tests.hooks.Wait;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver webDriver;
    protected Wait wait;

    public BasePage() {
        this.webDriver = SetupDriver.driver;
        this.wait = new Wait(this.webDriver);
    }
}
