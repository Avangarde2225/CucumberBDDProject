Feature: Create a Discount

  Scenario Outline: Discount Creation

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup
    And Click on parameters
    And Click on Discount
    And Click on plus icon
    And Type in the Description "<Description>"
    And Type in the IntegrationCode "<IntegrationCode>"
    And Type in the Priority "<Priority>"
    And Choose any value from the dropdown
    When Click on save button
    Then "<Description>" should be displayed
    And Remove the data "<Description>"
    Then Verify data is removed "<Description>"



    Examples:
      | Description | IntegrationCode | Priority|
      | discount1 | d1                | 1       |
      | discount2 | d2                | 2       |
      | discount3 | d3                | 3       |