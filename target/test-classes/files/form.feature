
@tag
Feature: To test all the textfied in the form

  @tag1
  Scenario: To test all the textfield in the form
    Given Open chrome browser and enter link it will open the form page
    When Fill firstName, lastName, Email, Contact
    And Click on submit button
    Then Thanku alert should be displayed
    
 
