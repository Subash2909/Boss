package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D2Task2Demoauto {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement btn = driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
		btn.click();
		List<WebElement> country = driver.findElements(By.xpath("//li[@class='select2-results__option']"));
		File file=new File("C:\\Users\\Subash\\eclipse-workspace\\Maven\\ExcelSheet\\Demo Country.xlsx");
		Workbook workbook=new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("list");
		for (int i = 0; i < country.size(); i++) {
			WebElement element = country.get(i);
			String text = element.getText();
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(text);
		}
		FileOutputStream fold= new FileOutputStream(file);
		workbook.write(fold);
		System.out.println("completed");
				
		
	}

}
