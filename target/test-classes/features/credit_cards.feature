Feature: Credit Cards API

  Scenario: Get credit cards data
    Given Faker API is ready
    When I request credit cards
    Then response status code should be 400
