package pages.homePage;

import io.cucumber.java.en.*;

public class HomeSteps {
    private HomePage homePage;

    public HomeSteps() {
        this.homePage = new HomePage();
    }

    @Given("that test stand is opened")
    public void thatTestStandIsOpened() {
        this.homePage.openHomePage();
    }

    @When("I click on the register tab")
    public void iClickOnTheRegisterTab() {
        System.out.println("STEP 2");
        this.homePage.clickOnTheRegisterTab();

    }
}
