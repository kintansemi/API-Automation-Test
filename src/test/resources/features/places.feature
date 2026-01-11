Feature: Places API

  Scenario: Get places data
    Given Faker API is ready
    When I request places
    Then response status code should be 200
