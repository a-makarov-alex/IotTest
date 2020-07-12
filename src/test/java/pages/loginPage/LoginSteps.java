package pages.loginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    private LoginPage loginPage;

    public LoginSteps() {
        this.loginPage = new LoginPage();
    }

    @When("I open the login page")
    public void iOpenTheLoginPage() {
        this.loginPage.openLoginPage();
    }

    @Given("that I have registered user with {word} name and {word} password")
    public void iHaveRegisteredUserWithNameAndPassword(String name, String password) {
        // it this particular case let's use the user from registration case
    }

    @When("I fill the login form with {word} name and {word} password")
    public void iFillTheLoginFormWithTestUserNameAndQweQWE123Password(String name, String password) {
        this.loginPage.fillLoginForm(name, password);
    }

    @When("I click on the login submit button")
    public void iClickOnTheLoginSubmitButton() {
        this.loginPage.clickOnSubmitLoginButton();
    }

    // Поскольку я не смог залогиниться в систему, я не могу создать проверку по какому-либо из её элементов.
    @Then("I see that some another page is opened")
    public void iSeeThatSomeAnotherPageIsOpened() {
        this.loginPage.checkThatItIsNotLoginPage();
    }
}
