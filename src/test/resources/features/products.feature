Feature: Products API

  Scenario: Get products data
    Given Faker API is ready
    When I request products
    Then response status code should be 200
