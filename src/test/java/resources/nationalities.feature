
Feature: Create a Nationality
  Scenario: Nationality Creation

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup
    And Click on parameters
    And Click on Nationality
    And Click on plus icon
    And Type in the Name "Tataristan"
    When Click on save button
    Then "Tataristan" should be displayed
    And Remove the data "Tataristan"
    Then Verify data is removed "Tataristan"