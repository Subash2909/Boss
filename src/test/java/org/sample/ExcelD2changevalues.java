package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelD2changevalues {
	public static void main(String[] args) throws IOException {
		File f =new   File("C:\\Users\\Subash\\eclipse-workspace\\Maven\\ExcelSheet\\Book1.xlsx");
		   FileInputStream stream= new FileInputStream(f);
		   Workbook workbook=new XSSFWorkbook(stream);
		   Sheet sheet = workbook.getSheet("Sheet1");
		   Row row = sheet.getRow(2);
		   Cell cell = row.getCell(0);
		   String values = cell.getStringCellValue();
		   // to change values
		   if (values.equals("boss")) {
			cell.setCellValue("Me Subash");
		} //to save the changaed values use-------->write method
		   FileOutputStream newfile = new FileOutputStream(f);
		   workbook.write(newfile);
		   System.out.println("Name changed");
		   
		   
	}

}
