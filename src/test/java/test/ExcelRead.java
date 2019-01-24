package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utilities.Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Iterator;

public class ExcelRead {

    public static void main(String[] args) throws Exception {


        File file = new File("C:\\Users\\rusly\\IdeaProjects\\chicago10cucumbejunit\\src\\SampleData.xlsx");
        System.out.println(file.exists());
        FileInputStream is = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(is);
        XSSFSheet worksheet = workbook.getSheet("Employees");

        System.out.println(worksheet.getRow(0).getCell(0));
        int usedRows = worksheet.getPhysicalNumberOfRows();
        int lastUsedRow = worksheet.getLastRowNum();

        //TODO: Print Out NAncy's Job_ID dynamically

        for(int i = 0; i< usedRows; i++){
            if(worksheet.getRow(i).getCell(0).toString().equals("Nancy")){
                System.out.println(worksheet.getRow(i).getCell(2));
                break;
            }
        }
        for(int i = 0; i< usedRows; i++){
            if(worksheet.getRow(i).getCell(1).toString().equals(Config.getProperty("client"))){
                int col = worksheet.getRow(i).getPhysicalNumberOfCells();
                for(int j =0; j<col; j++){
                    System.out.print(worksheet.getRow(i).getCell(j).toString() + " ");
                }
        break;
    }
}
        workbook.close();
                is.close();

    }
}
