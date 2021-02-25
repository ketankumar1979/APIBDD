Feature: Get list of users
  Scenario: Get list of users by Get method
    Given base URI
    When user use get method resource
    Then user should see response status code 200
    And user should validate body response successfully