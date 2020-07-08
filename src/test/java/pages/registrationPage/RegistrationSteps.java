package pages.registrationPage;

import io.cucumber.java.en.*;

public class RegistrationSteps {
    private RegistrationPage registrationPage;

    public RegistrationSteps() {
        this.registrationPage = new RegistrationPage();
    }

    @When("I fill the form for First Name")
    public void iFillTheFormForFirstName() {
        System.out.println("STEP 3");
        this.registrationPage.fillTheFormForFirstName("FIRST NAME");
    }
}
