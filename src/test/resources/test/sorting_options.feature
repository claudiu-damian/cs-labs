Feature: Sorting validation

  Background:
    Given I enter website https://loving-hermann-e2094b.netlify.app
    When I select section Men's wear
    And I enter the dropdown section Clothing

  Scenario: Sorting A-Z
    And I select the sorting option Name(A - Z)
    Then products are ordered by names ASC

  Scenario: Sorting Z-A
    And I select the sorting option Name(Z - A)
    Then products are ordered by names DESC

  Scenario: Sorting Price(High - Low)
    And I select the sorting option Price(High - Low)
    Then products are ordered by prices DESC

  Scenario: Sorting Price(Low - High)
    And I select the sorting option Price(Low - High)
    Then products are ordered by prices ASC