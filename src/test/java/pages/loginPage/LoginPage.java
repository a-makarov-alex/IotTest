package pages.loginPage;

import common.Util;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private static final String LOGIN_PAGE_URL = Util.BASE_URL + "mercurysignon.php";

    @FindBy(xpath = "//*[text()='REGISTER']")
    private WebElement registerButton;

}
