Feature: Addresses API

  Scenario: Get addresses data
    Given Faker API is ready
    When I request addresses
    Then response status code should be 200
    And response data should not be empty
