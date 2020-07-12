@withdrawal
Feature: TestIot feature



Scenario Outline: Login
  Given that test stand is opened
  And I have registered user with <userName> name and <password> password
  When I fill the login form with <userName> name and <password> password
  And I click on the login submit button
  Examples:
    | userName | password  |
    | TestUser | qweQWE123 |