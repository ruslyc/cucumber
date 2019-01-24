package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Test_steps {

    @When("user goes to google application")
    public void user_goes_to_google_application() {
        System.out.println("selenium is going to google");
    }

    @Then("user searches for apple")
    public void user_searches_for_apple() {
        System.out.println("user searching for a word apple");
        Assert.fail("failing on purpose");
    }

    @Then("user should see apple related results")
    public void user_should_see_apple_related_results() {
        System.out.println("user checking the results of the search");
    }

    @Given("something")
    public void something() {
        System.out.println("that user has access to internet");
    }

}
