package pages.loginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {
    private LoginPage loginPage;

    public LoginSteps() {
        this.loginPage = new LoginPage();
    }

    @Given("I have registered user with {word} name and qweQWE123 password")
    public void iHaveRegisteredUserWithNameAndPassword(String name, String password) {
        // it this particular case let's use the user from registration case
    }

    @When("I fill the login form with (.*) name and (.*) password")
    public void iFillTheLoginFormWithTestUserNameAndQweQWE123Password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click on the login submit button")
    public void iClickOnTheLoginSubmitButton() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
