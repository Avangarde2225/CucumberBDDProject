Feature: Create Citizenship
  Scenario: Citizenship creation

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup
    And Click on parameters
    And Click on citizenship
    And Click on plus icon
    And Type in the name "Tataris"
    And Type in the shortname "Tat"
    When Click on save button
    Then "Tataris" should be displayed