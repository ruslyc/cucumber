package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GasMileageCalculatorPage {

    WebDriver driver;
    public GasMileageCalculatorPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "uscodreading")
    public WebElement currentOdometerReading;

    @FindBy(id = "uspodreading")
    public WebElement previousOdometerReading;

    @FindBy(id = "usgasputin")
    public WebElement gasPutIn;

    @FindBy(id = "usgasprice")
    public WebElement gasPrice;

    @FindBy(xpath = "(//input[@value='Calculate'])[1]")
    public WebElement calculateButton;

    @FindBy(xpath = "//b[contains(text(),'miles per gallon')]")
    public WebElement resultInGallon;






}
