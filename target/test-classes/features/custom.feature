Feature: Custom API

  Scenario: Get custom data with quantity
    Given Faker API is ready
    When I request custom data with quantity 3
    Then response should contain 3 items
