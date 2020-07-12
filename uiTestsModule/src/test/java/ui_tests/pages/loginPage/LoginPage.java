package ui_tests.pages.loginPage;

import ui_tests.common.Util;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_tests.pages.BasePage;

public class LoginPage extends BasePage {
    private static final String LOGIN_PAGE_URL = Util.BASE_URL + "mercurysignon.php";

    public LoginPage() {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@name='userName']")
    private WebElement inputUserName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@name='login']")
    private WebElement submitLoginButton;

    public void openLoginPage() {
        webDriver.get(LOGIN_PAGE_URL);
        wait.forLoading(5);
    }

    public void fillLoginForm(String name, String password) {
        inputUserName.sendKeys(name);
        inputPassword.sendKeys(password);
    }

    public void clickOnSubmitLoginButton() {
        submitLoginButton.click();
    }

    public void checkThatItIsNotLoginPage() {
        Assert.assertNotEquals(webDriver.getCurrentUrl().split("\\?")[0], LOGIN_PAGE_URL);
    }

}
