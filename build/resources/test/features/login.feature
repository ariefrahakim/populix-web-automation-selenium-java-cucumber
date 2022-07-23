@Web
Feature: Login Feature

  @Login
  Scenario Outline: Login
    And user input "<username>" and "<password>"
    And user click show hidden password
    And user click login button
    Then user success login
    Examples:
      |   username      |  password      |
      |   qa            | engineer       |
      |                 | engineer       |
      |   qa            |                |

  @LoginWithFacebook
  Scenario: Login with facebook
    And user click facebook button
    Then user navigate to facebook

  @LoginWithGoogle
  Scenario: Login with google
    And user click google button
    Then user navigate to google

  @Register
  Scenario: Register
    And user click register button
    Then user navigate to register page

  @ForgotPassword
  Scenario: Forgot password
    And user click forgot password
    Then user navigate to forgot password



