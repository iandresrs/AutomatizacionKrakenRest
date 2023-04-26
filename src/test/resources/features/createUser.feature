#language:en
Feature: Create user

  Scenario: Create user
    Given I want create user to service "https://petstore.swagger.io/v2/user"
      | id | userName  | firstName | lastName | email                 | password   | phone      | userStatus |
      | 5  | andres20 | andres    | rincon   | andresrincon@gmail.com | rincon12345 | 3139584736 |     304    |
    Then  I validate the status code 200