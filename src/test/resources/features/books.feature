Feature: Books API

  Scenario: Get books data
    Given Faker API is ready
    When I request books
    Then response status code should be 200
