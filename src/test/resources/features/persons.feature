Feature: Persons API

  Scenario: Get persons data
    Given Faker API is ready
    When I request persons
    Then response status code should be 200
