$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/datatablesSO.feature");
formatter.feature({
  "name": "Testing dataTables website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@datatables3"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Testing adding new employee to the table",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the datatables homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks to new button",
  "keyword": "And "
});
formatter.step({
  "name": "User should see Create New Entry Box",
  "keyword": "Then "
});
formatter.step({
  "name": "User should enter firstname \"\u003cfirstname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter lastname \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter position \"\u003cposition\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter office \"\u003coffice\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter extension \"\u003cextension\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter start date \"\u003cdate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter salary \"\u003csalary\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should click to create button",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters first name \"\u003cfirstname\u003e\" to search box",
  "keyword": "And "
});
formatter.step({
  "name": "User should see first name \"\u003cfirstname\u003e\" is inserted in the table",
  "keyword": "Then "
});
formatter.examples({
  "name": "Test data for datatables",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "position",
        "office",
        "extension",
        "date",
        "salary"
      ]
    },
    {
      "cells": [
        "John",
        "Doe",
        "clerk",
        "London",
        "453",
        "2019-01-01",
        "1200"
      ]
    },
    {
      "cells": [
        "Andrew",
        "Black",
        "supervisor",
        "Chicago",
        "312",
        "2019-01-05",
        "1500"
      ]
    },
    {
      "cells": [
        "Kate",
        "Alba",
        "accountant",
        "Paris",
        "334",
        "2019-05-01",
        "1200"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing adding new employee to the table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@datatables3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the datatables homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Datatables_steps.user_is_on_the_datatables_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks to new button",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_clicks_to_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see Create New Entry Box",
  "keyword": "Then "
});
formatter.match({
  "location": "Datatables_steps.user_should_see_Create_New_Entry_Box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter firstname \"John\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_firstname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter lastname \"Doe\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_lastname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter position \"clerk\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_position(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter office \"London\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_office(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter extension \"453\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_extension(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.fail(Assert.java:95)\r\n\tat steps.Datatables_steps.user_should_enter_extension(Datatables_steps.java:107)\r\n\tat ✽.User should enter extension \"453\"(src/test/resources/features/datatablesSO.feature:12)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User should enter start date \"2019-01-01\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_start_date(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter salary \"1200\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_salary(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should click to create button",
  "keyword": "Then "
});
formatter.match({
  "location": "Datatables_steps.user_should_click_to_create_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters first name \"John\" to search box",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_enters_first_name_to_search_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see first name \"John\" is inserted in the table",
  "keyword": "Then "
});
formatter.match({
  "location": "Datatables_steps.user_should_see_first_name_is_inserted_in_the_table(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing adding new employee to the table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@datatables3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the datatables homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Datatables_steps.user_is_on_the_datatables_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks to new button",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_clicks_to_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see Create New Entry Box",
  "keyword": "Then "
});
formatter.match({
  "location": "Datatables_steps.user_should_see_Create_New_Entry_Box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter firstname \"Andrew\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_firstname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter lastname \"Black\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_lastname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter position \"supervisor\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_position(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter office \"Chicago\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_office(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter extension \"312\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_extension(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.fail(Assert.java:95)\r\n\tat steps.Datatables_steps.user_should_enter_extension(Datatables_steps.java:107)\r\n\tat ✽.User should enter extension \"312\"(src/test/resources/features/datatablesSO.feature:12)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User should enter start date \"2019-01-05\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_start_date(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter salary \"1500\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_salary(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should click to create button",
  "keyword": "Then "
});
formatter.match({
  "location": "Datatables_steps.user_should_click_to_create_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters first name \"Andrew\" to search box",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_enters_first_name_to_search_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see first name \"Andrew\" is inserted in the table",
  "keyword": "Then "
});
formatter.match({
  "location": "Datatables_steps.user_should_see_first_name_is_inserted_in_the_table(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing adding new employee to the table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@datatables3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the datatables homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Datatables_steps.user_is_on_the_datatables_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks to new button",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_clicks_to_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see Create New Entry Box",
  "keyword": "Then "
});
formatter.match({
  "location": "Datatables_steps.user_should_see_Create_New_Entry_Box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter firstname \"Kate\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_firstname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter lastname \"Alba\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_lastname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter position \"accountant\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_position(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter office \"Paris\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_office(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter extension \"334\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_extension(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.fail(Assert.java:95)\r\n\tat steps.Datatables_steps.user_should_enter_extension(Datatables_steps.java:107)\r\n\tat ✽.User should enter extension \"334\"(src/test/resources/features/datatablesSO.feature:12)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User should enter start date \"2019-05-01\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_start_date(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter salary \"1200\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_should_enter_salary(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should click to create button",
  "keyword": "Then "
});
formatter.match({
  "location": "Datatables_steps.user_should_click_to_create_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters first name \"Kate\" to search box",
  "keyword": "And "
});
formatter.match({
  "location": "Datatables_steps.user_enters_first_name_to_search_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see first name \"Kate\" is inserted in the table",
  "keyword": "Then "
});
formatter.match({
  "location": "Datatables_steps.user_should_see_first_name_is_inserted_in_the_table(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "status": "passed"
});
});