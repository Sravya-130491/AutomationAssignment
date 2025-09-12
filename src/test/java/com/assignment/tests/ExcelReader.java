package com.assignment.tests;

import org.apache.poi.xssf.usermodel.*;
import java.io.*;

public class ExcelReader {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("employee_data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            System.out.println(
                sheet.getRow(i).getCell(0) + " " +
                sheet.getRow(i).getCell(1) + " " +
                sheet.getRow(i).getCell(2)
            );
        }
        workbook.close();
    }
}
