Feature: Users API

  Scenario: Get users data
    Given Faker API is ready
    When I request users
    Then response status code should be 200
    And response data should not be empty
