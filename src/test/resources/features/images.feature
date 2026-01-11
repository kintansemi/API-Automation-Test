Feature: Images API

  Scenario: Get images
    Given Faker API is ready
    When I request images
    Then response status code should be 200
