package test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelWrite {

    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook;
        XSSFSheet worksheet;
        XSSFCell cell;
        XSSFRow row;
        String path = "C:\\Users\\rusly\\IdeaProjects\\chicago10cucumbejunit\\src\\SampleData.xlsx";

        FileInputStream is = new FileInputStream(path);

        workbook = new XSSFWorkbook(is);
        worksheet = workbook.getSheet("Employees");
        row = worksheet.getRow(4);
        cell = row.getCell(0);
        System.out.println(cell.toString());

        XSSFCell adamCell = worksheet.getRow(5).getCell(0);
        System.out.println(adamCell);
        adamCell.setCellValue("GREG");
        FileOutputStream fo = new FileOutputStream(path);
        System.out.println(adamCell);
        int usedRows = worksheet.getPhysicalNumberOfRows();
        for(int i = 0; i< usedRows; i++){
            if(worksheet.getRow(i).getCell(0).toString().equals("GREG")){
                worksheet.getRow(i).getCell(2).setCellValue("President");
                break;
            }
        }
        workbook.write(fo);


        fo.close();
        is.close();
        workbook.close();


    }
}
