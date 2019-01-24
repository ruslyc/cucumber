package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utilities.Driver;

public class AmazonTitle_steps {
    @Given("user goes to amazon application")
    public void user_goes_to_amazon_application(){
        Driver.getDriver().get("https://amazon.com");
    }


    @Then("user should see the proper title")
    public void user_should_see_the_proper_title() {
        String title = "AmazonPage.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        Assert.assertEquals(title, Driver.getDriver().getTitle());

    }

    @Then("user should validate url")
    public void user_should_validate_url() {
        String url = "https://www.amazon.com/";
        Assert.assertEquals(url,Driver.getDriver().getCurrentUrl());

    }

}
