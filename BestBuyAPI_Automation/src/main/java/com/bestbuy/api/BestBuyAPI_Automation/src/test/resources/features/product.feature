Feature: Product API Testing

  Scenario: Verify all products can be retrieved
    Given I send a GET request to "/products"
    Then The response status should be 200

