@withdrawal
Feature: TestIot feature

Scenario: Registration of a new user
  Given that test stand is opened
  When I click on the register tab
  And I fill the register form with valid data
  And I click on the submit button
  Then I see a message that registration finished successfully

Scenario Outline: Login
  Given that I have registered user with <userName> name and <password> password
  When I open the login page
  And I fill the login form with <userName> name and <password> password
  And I click on the login submit button
  Then I see that some another page is opened
  Examples:
    | userName | password  |
    | NewUser  | qweQWE123 |