
Feature: Create a Country
  Scenario: Country Creation

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup
    And Click on parameters
    And Click on countries
    And Click on plus icon
    And Type in the Name "Tataristan"
    And Type in the Code "TT"
    When Click on save button
    Then "Tataristan" should be displayed