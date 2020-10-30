Feature: View Button

  Scenario: View button displays when hovering a product
    Given I enter website https://loving-hermann-e2094b.netlify.app
    When I select section Men's wear
    And I enter the dropdown section Clothing
    And I hover product Running Shoes
    Then the View button is displayed for product Running Shoes