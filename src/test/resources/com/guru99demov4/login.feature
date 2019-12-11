Feature: Verify the Login Screen
  In order to access the website
  As a user
  I want to now if my login is successful or not

  @high-impact
  Scenario Outline: a valid user logs into banking site
    Given I am logged out
    When  I enter username "<username>" and password "<password>"
    Then the user is informed that the login is successful
    Examples:
      | username  | password |
      | mngr236159| nUvuzAj  |


  Scenario Outline: an invalid user logs into banking site
    Given I am logged out
    When  I enter invalid username "<username>" and invalid password "<password>"
    Then the user is informed that the login is unsuccessful
    Examples:
      | username  | password |
      | test2     | nUvuzAj  |
      | mngr236159| padddsds |
      |sdasdasdasd| esfdsdf  |






