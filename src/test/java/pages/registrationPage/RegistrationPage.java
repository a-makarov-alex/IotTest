package pages.registrationPage;

import common.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class RegistrationPage extends BasePage {
    private static final String REGISTER_PAGE_URL = Util.BASE_URL + "mercuryregister.php";

    @FindBy(xpath = "//b[normalize-space(.)='FirstName:']/ancestor::tr[1]/descendant::input")
    private WebElement inputFirstName;

    public RegistrationPage() {
        PageFactory.initElements(webDriver, this);
    }

    public void fillTheFormForFirstName(String value) {
        System.out.println("STEP 3");
    }

//    public static String getInputByFieldName(String fieldName) {
//        return "//b[normalize-space(.)='" + fieldName + ":']/ancestor::tr[1]/descendant::input";
//    }
}
