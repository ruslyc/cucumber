package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.WikipediaPage;
import utilities.Driver;

public class Wiki_steps {

    WikipediaPage wp = new WikipediaPage();

    @Given("User is on the Wikipedia homepage")
    public void user_is_on_the_Wikipedia_homepage() {
        Driver.getDriver().get("https://wikipedia.com");
    }

    @When("User enters steve jobs to search bar and hits enter")
    public void user_enters_steve_jobs_to_search_bar_and_hits_enter() {
       wp.searchBox.sendKeys("steve jobs", Keys.ENTER);
    }

    @Then("User shouls see the first header is displaying steve jobs")
    public void user_shouls_see_the_first_header_is_displaying_steve_jobs() {
        Assert.assertTrue("doesnt contain the specified string",wp.firstHeader.getText().equalsIgnoreCase("steve jobs"));
    }

}
