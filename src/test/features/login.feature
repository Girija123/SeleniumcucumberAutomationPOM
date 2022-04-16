Feature: Login
  As a user
  I should be logging in and use the app

  @login
  Scenario: Verify login with invalid username and password

    Given I'm on HomePage "http://www.next.co.uk"
    When I click My account link
    And I enter username "GeorgeAdams@Sample.com" and password "Adasm43"
    And I click Sign in button
    Then I shouldn't be allowed login instead an error message as "Login unsuccessful"