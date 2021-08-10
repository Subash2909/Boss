package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelClass {
	public static void main(String[] args) throws IOException {
		File f =new   File("C:\\Users\\Subash\\eclipse-workspace\\Maven\\ExcelSheet\\Book1.xlsx");
   FileInputStream stream= new FileInputStream(f);
   Workbook workbook=new XSSFWorkbook(stream);
   Sheet sheet = workbook.getSheet("Sheet1");
   Row row = sheet.getRow(5);
   Cell cell = row.getCell(7);
   System.out.println(cell);
   // to get rows count
   int rowCount = sheet.getPhysicalNumberOfRows();
   System.out.println(rowCount);
   // we can take count of  cell of a row
   int cellCount = row.getPhysicalNumberOfCells();
   System.out.println(cellCount);
   for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
	// to get each cell
	   Cell cell2 = row.getCell(i);
	   System.out.println(cell2);
}
   
	}

}
