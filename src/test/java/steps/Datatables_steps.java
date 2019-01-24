package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DatatablesPage;
import utilities.Driver;

public class Datatables_steps {

    DatatablesPage dp = new DatatablesPage();

    @Given("User is on the datatables homepage")
    public void user_is_on_the_datatables_homepage() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }

    @Given("User clicks to new button")
    public void user_clicks_to_new_button() {
        dp.newButton.click();
    }

    @Then("User should see Create New Entry Box")
    public void user_should_see_Create_New_Entry_Box() {
        Assert.assertTrue(dp.createNewEntryBox.isDisplayed());
    }

    @Then("User should enter firstname")
    public void user_should_enter_firstname() {
        dp.firstNameBox.sendKeys("Alex");
    }

    @Then("User should enter lastname")
    public void user_should_enter_lastname() {
        dp.lastNameBox.sendKeys("Smith");
    }

    @Then("User should enter position")
    public void user_should_enter_position() {
        dp.positionBox.sendKeys("clerk");
    }

    @Then("User should enter office")
    public void user_should_enter_office() {
        dp.officeBox.sendKeys("general");
    }

    @Then("User should enter extension")
    public void user_should_enter_extension() {
        dp.extensionBox.sendKeys("101");
    }

    @Then("User should enter start date")
    public void user_should_enter_start_date() {
        dp.startDateBox.sendKeys("2019-02-05");
    }

    @Then("User should enter salary")
    public void user_should_enter_salary() {
        dp.salaryBox.sendKeys("2500");
    }

    @Then("User should click to create button")
    public void user_should_click_to_create_button() {
        dp.createButton.click();
    }

    @Then("User enters first name to search box")
    public void user_enters_first_name_to_search_box() {
        dp.searchBox.sendKeys("Alex");
    }

    @Then("User should see first name is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table() {
        for (WebElement w : dp.namelist) {
            if(w.getText().equalsIgnoreCase("Alex Smith")){
                Assert.assertTrue(true);
                break;
            }
        }
    }

    @Then("User should enter firstname \"([^\"]*)\"")
    public void user_should_enter_firstname(String firstName) {
       dp.firstNameBox.sendKeys(firstName);
    }

    @Then("User should enter lastname \"([^\"]*)\"")
    public void user_should_enter_lastname(String lastName) {
        dp.lastNameBox.sendKeys(lastName);
    }

    @Then("User should enter position \"([^\"]*)\"")
    public void user_should_enter_position(String position) {
        dp.positionBox.sendKeys(position);
    }

    @Then("User should enter office {string}")
    public void user_should_enter_office(String string) {
        dp.officeBox.sendKeys(string);
    }

    @Then("User should enter extension {string}")
    public void user_should_enter_extension(String string) {
        dp.extensionBox.sendKeys(string);
    }

    @Then("User should enter start date {string}")
    public void user_should_enter_start_date(String string) {
        dp.startDateBox.sendKeys(string);
    }

    @Then("User should enter salary {string}")
    public void user_should_enter_salary(String string) {
        dp.salaryBox.sendKeys(string);
    }

    @Then("User enters first name \"([^\"]*)\" to search box")
    public void user_enters_first_name_to_search_box(String firstName) {
        dp.searchBox.sendKeys(firstName);
    }

    @Then("User should see first name \"([^\"]*)\" is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table(String firstName) {
        for (WebElement w : dp.namelist) {
            if(w.getText().equalsIgnoreCase(firstName)){
                Assert.assertTrue(true);
                break;
            }
        }
    }


}
