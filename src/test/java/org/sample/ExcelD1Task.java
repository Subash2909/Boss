package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelD1Task {
	public static void main(String[] args) throws IOException {
		File f =new   File("C:\\Users\\Subash\\eclipse-workspace\\Maven\\ExcelSheet\\Book1.xlsx");
   FileInputStream stream= new FileInputStream(f);
   Workbook workbook=new XSSFWorkbook(stream);
   Sheet sheet = workbook.getSheet("Sheet1");
for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	System.out.println(" ROW Started :");
	Row row = sheet.getRow(i);
	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		Cell cell = row.getCell(j);
		System.out.println(cell);
		//int type = cell.getCellType();
		//System.out.println(type);
}}}}