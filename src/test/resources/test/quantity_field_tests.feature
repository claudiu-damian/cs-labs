Feature: Cart quantity field validation

  @lol
  Scenario Outline: Quantity field validation
    Given I enter website https://loving-hermann-e2094b.netlify.app
    When I select section Men's wear
    And I enter the dropdown section Clothing
    And I add to cart product Running Shoes
    And I change quantity to <quantity>
    Then I get the warning message Please match the requested format.

    Examples:
      | quantity |
      | sda      |
      | -8       |