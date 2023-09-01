Feature: Deleting Client
  
Scenario: Deleting a client
    Given the user is on the view client page
    When the user click on the delete button
    And the user click on ok button for confirmation
    Then the Client deleted successfully message should be on output page