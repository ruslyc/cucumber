package test;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.GasMileageCalculatorPage;
import utilities.Config;
import utilities.Driver;

import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class GasMileageCalculatorTest {
    GasMileageCalculatorPage gsObj;
    private WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet worksheet;
    FileInputStream inputStream;
    FileOutputStream outputStream;


    @Before
    public void setUp() throws IOException {
        driver = Driver.getDriver();
        driver.get("https://www.calculator.net/gas-mileage-calculator.html");
        inputStream = new FileInputStream(Config.getProperty("gasmileage.testdata.path"));
        workbook = new XSSFWorkbook(inputStream);
        worksheet = workbook.getSheet("Sheet1");

    }

    @Test
    public void dataDrivenMileageCalculatorTest() throws IOException {
        gsObj = new GasMileageCalculatorPage();
        for (int rowNum = 1; rowNum < worksheet.getPhysicalNumberOfRows(); rowNum++) {

            XSSFRow currentRow = worksheet.getRow(rowNum);

            if(!currentRow.getCell(0).toString().equals("Y")){
                if(currentRow.getCell(6)==null){
                    currentRow.createCell(6);
                }
                currentRow.getCell(6).setCellValue("Not requested");
                continue;
            }


            double currentOdo = currentRow.getCell(1).getNumericCellValue();
            gsObj.currentOdometerReading.clear();
            gsObj.currentOdometerReading.sendKeys(String.valueOf(currentOdo));

            double previousOdo = currentRow.getCell(2).getNumericCellValue();

            gsObj.previousOdometerReading.clear();
            gsObj.previousOdometerReading.sendKeys(String.valueOf(previousOdo));

            double gas = currentRow.getCell(3).getNumericCellValue();
            gsObj.gasPutIn.clear();
            gsObj.gasPutIn.sendKeys(String.valueOf(gas));

            gsObj.calculateButton.click();

            double expectedResult = (currentOdo - previousOdo) / gas;

            String[] actualResult = gsObj.resultInGallon.getText().split(" ");
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");

            if(currentRow.getCell(4)==null){
                currentRow.createCell(4);
            }
            currentRow.getCell(4).setCellValue(decimalFormat.format(expectedResult));

            if(currentRow.getCell(5)==null){
                currentRow.createCell(5);
            }
            currentRow.getCell(5).setCellValue(actualResult[0]);

            if (String.valueOf(decimalFormat.format(expectedResult)).equals(actualResult[0])) {
                if(currentRow.getCell(6)==null){
                    currentRow.createCell(6);
                }
                currentRow.getCell(6).setCellValue("PASS");
                System.out.println("PASS");
            } else {
                if(currentRow.getCell(6)==null){
                    currentRow.createCell(6);
                }
                currentRow.getCell(6).setCellValue("FAIL");
                System.out.println("FAIL");
            }
            if(currentRow.getCell(7)==null){
                currentRow.createCell(7);
            }
            currentRow.getCell(7).setCellValue(LocalDateTime.now().toString());

        }

        outputStream = new FileOutputStream(Config.getProperty("gasmileage.testdata.path"));
        workbook.write(outputStream);
        outputStream.close();
        inputStream.close();
    }
}
