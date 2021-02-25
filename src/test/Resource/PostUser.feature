Feature: Add users

  Scenario: Add users by POST Method
    Given base URI, ContentType and body
    When user uses POST method with resource and query param
    Then user should get correct response and validate status code, body.
