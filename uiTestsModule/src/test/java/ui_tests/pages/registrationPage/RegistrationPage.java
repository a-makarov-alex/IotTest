package ui_tests.pages.registrationPage;

import ui_tests.common.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_tests.pages.BasePage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class RegistrationPage extends BasePage {
    private static final String REGISTER_PAGE_URL = Util.BASE_URL + "mercuryregister.php";

    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement inputFirstName;

    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement inputLastName;

    @FindBy(xpath = "//input[@name='phone']")
    private WebElement inputPhone;

    @FindBy(xpath = "//input[@name='userName']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@name='address1']")
    private WebElement inputAddress1;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement inputCity;

    @FindBy(xpath = "//input[@name='state']")
    private WebElement inputState;

    @FindBy(xpath = "//input[@name='postalCode']")
    private WebElement inputPostalCode;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement inputUserName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    private WebElement inputConfirmPassword;

    @FindBy(xpath = "//input[@name='register']")
    private WebElement submitButton;

    @FindBy(xpath = "//font[contains(text(),'Thank you for registering')]")
    private WebElement successMessage;

    @FindBy(xpath = "//a[normalize-space(.)='sign-in']")
    private WebElement signInLink;

    public RegistrationPage() {
        PageFactory.initElements(webDriver, this);
    }

    public void fillTheRegisterFormWithValidData() {
        // Contact info
        inputFirstName.sendKeys("TestName");
        inputLastName.sendKeys("TestSurname");
        inputPhone.sendKeys("1234567");
        inputEmail.sendKeys("test@email.com");

        // Mailing info
        inputAddress1.sendKeys("TestStreet, 1");
        inputCity.sendKeys("TestCity");
        inputState.sendKeys("TestState");
        inputPostalCode.sendKeys("5555555");

        // User Info
        Properties prop = new Properties();
        String userinfoPropName = "creds.properties";
        try (InputStream io = getClass().getClassLoader().getResourceAsStream(userinfoPropName)) {
            if (io != null) {
                prop.load(io);
            } else {
                throw new FileNotFoundException("property file '" + userinfoPropName + "' not found");
            }
            inputUserName.sendKeys(prop.getProperty("username"));
            inputPassword.sendKeys(prop.getProperty("password"));
            inputConfirmPassword.sendKeys(prop.getProperty("password"));
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }

    public void clickOnTheSubmitButton() {
        submitButton.click();
    }

    public void checkRegistrationFinishedMessage() {
        successMessage.isDisplayed();
        signInLink.click();
    }
}
