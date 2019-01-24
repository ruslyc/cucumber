@datatables3
Feature: Testing dataTables website
  Scenario Outline: Testing adding new employee to the table

    Given User is on the datatables homepage
    And User clicks to new button
    Then User should see Create New Entry Box
    And User should enter firstname "<firstname>"
    And User should enter lastname "<lastname>"
    And User should enter position "<position>"
    And User should enter office "<office>"
    And User should enter extension "<extension>"
    And User should enter start date "<date>"
    And User should enter salary "<salary>"
    Then User should click to create button
    And User enters first name "<firstname>" to search box
    Then User should see first name "<firstname>" is inserted in the table

    Examples: Test data for datatables
      |firstname|lastname|position  |office |extension|date      |salary|
      |John     | Doe    |clerk     |London |453      |2019-01-01|1200  |
      |Andrew   |Black   |supervisor|Chicago|312      |2019-01-05|1500  |
      |Kate     |Alba    |accountant|Paris  |334      |2019-05-01| 1200 |
      #|John     | Doe    |clerk     |London |453      |2019-01-01|1200  |
      #|Andrew   |Black   |supervisor|Chicago|312      |2019-01-05|1500  |
      #|Kate     |Alba    |accountant|Paris  |334      |2019-05-01|2000  |