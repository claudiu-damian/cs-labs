Feature: Search tests

  Background:
    Given I enter website https://www.google.com/

  Scenario: Searching wrong world gives a valid suggestion
    When I search for wating
    And I click on suggestion
    Then result corresponds

  Scenario: Searching an invalid word will display nothing
    When I search for ++++++
    Then no results are displayed

  Scenario: Searching for a particular word gives similar sugestions
    When I type in search Technical
    Then I get suggestions with Technical

  Scenario: Header is displayed after search
    When I search for computer
    Then header is displayed