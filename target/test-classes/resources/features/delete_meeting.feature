Feature: Deleting Meeting
  
Scenario: Deleting a Meeting
    Given the user is on the view meeting page
    When the user click on the delete button
    And the user click on ok button for confirmation
    Then the Meeting deleted successfully message should be on output page