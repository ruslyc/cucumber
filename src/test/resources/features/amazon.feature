Feature: Amazon search
  @amazon
  Scenario: Amazon search test
    Given user goes to amazon application
    When User enters headphones keyword
    And User clicks amazon search button
    Then User should see headphones in results