#language:en
Feature: Place an order for a pet

  Scenario: Place an order for a pet successfully
    Given I want place an order for a pet to service "https://petstore.swagger.io/v2/store/order"
      | id | petId | quantity | shipDate                 | status   | complete |
      | 2  | 2727  | 5        | 2023-04-26T19:14:57.065Z | approved | true     |
    Then I validate the status code is 200