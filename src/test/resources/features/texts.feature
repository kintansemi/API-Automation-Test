Feature: Texts API

  Scenario: Get texts data
    Given Faker API is ready
    When I request texts
    Then response status code should be 200
