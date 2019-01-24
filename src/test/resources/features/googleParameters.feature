@googleParameters
Feature: Google search functionality

  Scenario: Testing google search
    Given User is on the google homepage
    When User enters flowers
    Then User Should see flowers in the title