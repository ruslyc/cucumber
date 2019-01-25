package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.GasMileageCalculatorPage;
import utilities.Driver;



public class GasMileageCalculatorTest {
    GasMileageCalculatorPage gsObj;
    private WebDriver driver;

    @Before
    public void setUp(){
       driver = Driver.getDriver();
        driver.get("https://www.calculator.net/gas-mileage-calculator.html");
    }

    @Test
    public void dataDrivenMileageCalculatorTest(){
         gsObj= new GasMileageCalculatorPage();
         gsObj.currentOdometerReading.clear();
        gsObj.currentOdometerReading.sendKeys();

        gsObj.previousOdometerReading.clear();
        gsObj.previousOdometerReading.sendKeys();

        gsObj.gasPutIn.clear();
        gsObj.gasPutIn.sendKeys();


    }
}
