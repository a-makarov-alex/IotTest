package pages.homePage;

import common.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class HomePage extends BasePage {
    private static final String HOME_PAGE_URL = Util.BASE_URL;

    @FindBy(xpath = "//*[text()='REGISTER']")
    private WebElement registerButton;

    public HomePage() {
        PageFactory.initElements(webDriver, this);
    }

    public void openHomePage() {
        webDriver.get(HOME_PAGE_URL);
        wait.forLoading(5);
    }

    public void clickOnTheRegisterTab() {
        registerButton.click();
        wait.forLoading(5);
    }

}
