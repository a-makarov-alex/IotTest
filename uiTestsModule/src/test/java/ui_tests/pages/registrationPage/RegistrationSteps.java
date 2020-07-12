package ui_tests.pages.registrationPage;

import io.cucumber.java.en.*;

public class RegistrationSteps {
    private RegistrationPage registrationPage;

    public RegistrationSteps() {
        this.registrationPage = new RegistrationPage();
    }

    @When("I fill the register form with valid data")
    public void iFillTheRegisterFormWithValidData() {
        this.registrationPage.fillTheRegisterFormWithValidData();
    }

    @When("I click on the submit button")
    public void iClickOnTheSubmitButton() {
        this.registrationPage.clickOnTheSubmitButton();
    }

    @Then("I see a message that registration finished successfully")
    public void iSeeAMessageThatRegistrationFinishedSuccessfully() {
        this.registrationPage.checkRegistrationFinishedMessage();
    }
}
