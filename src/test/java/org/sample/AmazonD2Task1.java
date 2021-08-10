package org.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonD2Task1 {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txt = driver.findElement(By.id("twotabsearchtextbox"));
		txt.sendKeys("tv",Keys.ENTER);
		File file=new File("C:\\Users\\Subash\\eclipse-workspace\\Maven\\ExcelSheet\\Amazontv.xlsx");
		Workbook workbook=new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("TV LIST");
		List<WebElement>  tvName = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (int i = 0; i < tvName.size(); i++) {
			WebElement element = tvName.get(i);
			String text = element.getText();
		//	Sheet sheet = workbook.createSheet("TV LIST");
			Row row = sheet.createRow(i);
			Cell createCell = row.createCell(0);
			createCell.setCellValue(text);
			
		}
		FileOutputStream x= new FileOutputStream(file);
		workbook.write(x);
		System.out.println(" completed");
	}

}
