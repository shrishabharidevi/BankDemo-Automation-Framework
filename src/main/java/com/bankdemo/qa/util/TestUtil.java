package com.bankdemo.qa.util;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;

import com.bankdemo.qa.base.TestBase;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT= 20;
	public static long IMPLICIT_WAIT= 10;
	public static String TESTDATA_SHEET_PATH = "C:/Users/shri9/eclipse-workspace/SampleProject/BankDemo/src/main/java/com/bankdemo/qa/testdata/bankDemo_testdata.xlsx";

	static Workbook book;
	static Sheet sheet;
	static JavascriptExecutor js;


	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rowCount - 1][colCount];
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < rowCount - 1; i++) {

		    Row row = sheet.getRow(i + 1);

		    if (row == null) {
		        System.out.println("Skipping null row: " + (i + 1));
		        continue;
		    }

		    for (int k = 0; k < colCount; k++) {
		        Cell cell = row.getCell(k);
		        data[i][k] = (cell == null) ? "" : cell.toString();
		    }
		}

		return data;
	}
		
public static void takeScreenshotAtEndOfTest() throws IOException {
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String currentDir = System.getProperty("user.dir");
	FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
}
}
