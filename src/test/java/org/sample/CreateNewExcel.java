package org.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


public class CreateNewExcel {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Subash\\eclipse-workspace\\Maven\\ExcelSheet\\newExcel.xlsx");
	Workbook book=new XSSFWorkbook();
	//to create Sheet
	Sheet sheet = book.createSheet("Day2");
	//to create row
	Row row = sheet.createRow(0);
	//to create cell
	Cell cell = row.createCell(0);
	cell.setCellValue("Subash");
	FileOutputStream m=new FileOutputStream(file);
	book.write(m);
    System.out.println(" file created");
	
	
	
	
	}

}
