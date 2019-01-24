Feature: Wikipedia search feature
@wikipediaSearch
  Scenario: Wikipedia search test
    Given User is on the Wikipedia homepage
    When User enters steve jobs to search bar and hits enter
    Then User shouls see the first header is displaying steve jobs
