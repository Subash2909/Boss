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

public class ExcelOverLoading {
	public String getData( int rowno,int cellno) throws IOException {
		File file=new File("C:\\Users\\Subash\\eclipse-workspace\\Maven\\ExcelSheet\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		String cellValue = cell.getStringCellValue();
		return cellValue;

	}

}
