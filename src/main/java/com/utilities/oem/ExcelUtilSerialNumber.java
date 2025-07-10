package com.utilities.oem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class ExcelUtilSerialNumber {

    private static final String FILE_PATH = System.getProperty("user.dir") + "/data/serialnumberdata.xlsx";

    // ✅ Read data from cell
    public static String getCellData(String sheetName, int rowNum, int cellNum)
            throws EncryptedDocumentException, IOException {

        FileInputStream file = new FileInputStream(new File(FILE_PATH));
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheet(sheetName);
        Row row = sheet.getRow(rowNum);
        Cell cell = row.getCell(cellNum);

        String value = "";

        if (cell != null) {
            switch (cell.getCellType()) {
                case STRING:
                    value = cell.getStringCellValue();
                    break;
                case NUMERIC:
                    value = String.valueOf((long) cell.getNumericCellValue());
                    break;
                case BOOLEAN:
                    value = String.valueOf(cell.getBooleanCellValue());
                    break;
                case FORMULA:
                    value = cell.getCellFormula();
                    break;
                case BLANK:
                    value = "";
                    break;
                default:
                    value = "";
                    break;
            }
        }

        workbook.close();
        file.close();
        return value;
    }

    /* ✅ Write data to cell
    public static void setCellData(String sheetName, int rowNum, int cellNum, String data)
            throws IOException, EncryptedDocumentException, InvalidFormatException {

        File file = new File(FILE_PATH);
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = WorkbookFactory.create(fis);

        Sheet sheet = workbook.getSheet(sheetName);
        if (sheet == null) {
            sheet = workbook.createSheet(sheetName);
        }

        Row row = sheet.getRow(rowNum);
        if (row == null) {
            row = sheet.createRow(rowNum);
        }

        Cell cell = row.getCell(cellNum);
        if (cell == null) {
            cell = row.createCell(cellNum);
        }

        cell.setCellValue(data);

        fis.close();

        FileOutputStream fos = new FileOutputStream(file);
        workbook.write(fos);
        workbook.close();
        fos.close();
    }
    */
}
