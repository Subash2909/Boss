package org.sample;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdactinBooking {
	public static void main(String[] args) throws IOException, InterruptedException {
		LibGlobal global=new LibGlobal();
		WebDriver driver = global.getDriver();
		global.loadUrl("https://adactinhotelapp.com/");
		//File file=new File("C:\\Users\\Subash\\eclipse-workspace\\Maven\\ExcelSheet\\AdactinD4.xlsx");
		WebElement txtuser = driver.findElement(By.id("username"));
		//global.type(txtuser, "Mayilsamy");
		global.type(txtuser, global.getData(1, 0));
		WebElement txtpass = driver.findElement(By.id("password"));
		//global.type(txtpass, "6QXF2G");
		global.type(txtpass, global.getData(1, 1));
		
		
		WebElement btnClick = driver.findElement(By.id("login"));
	    global.click(btnClick);
		//File file=new File("C:\\Users\\Subash\\eclipse-workspace\\Maven\\ExcelSheet\\AdactinD4.xlsx");
		WebElement locate = driver.findElement(By.id("location"));
		global.type(locate, global.getData(1, 2));
		WebElement hotel = driver.findElement(By.id("hotels"));
		global.type(hotel, global.getData(1, 3));
		WebElement room = driver.findElement(By.id("room_type"));
		global.type(room, global.getData(1, 4));
		WebElement roomNumbers = driver.findElement(By.id("room_nos"));
		global.type(roomNumbers, global.getData(1, 5));
		
/*		WebElement chkinDate = driver.findElement(By.id("datepick_in"));
		global.clearText(chkinDate);
		global.type(chkinDate, global.getData(1, 6));
		WebElement chkOut = driver.findElement(By.id("datepick_out"));
		global.clearText(chkOut);
	   global.type(chkOut, global.getData(1, 7)); */
		WebElement aduldMen = driver.findElement(By.id("adult_room"));
		global.type(aduldMen, global.getData(1, 8));
		WebElement childNo = driver.findElement(By.id("child_room"));
		global.type(childNo, global.getData(1, 9));
		WebElement btnSearch = driver.findElement(By.id("Submit"));
		global.click(btnSearch);
		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
		global.click(radioBtn);
		WebElement btnContinue = driver.findElement(By.id("continue"));
		global.click(btnContinue);
		WebElement firstName = driver.findElement(By.id("first_name"));
	    global.type(firstName, global.getData(1, 10));
	   WebElement lastName = driver.findElement(By.id("last_name"));
	    global.type(lastName, global.getData(1, 11));
	    WebElement adress = driver.findElement(By.id("address"));
	    global.type(adress, global.getData(1, 12));
	    WebElement cardNum = driver.findElement(By.id("cc_num"));
	    global.type(cardNum, global.getData(1, 13));
	    WebElement cardType = driver.findElement(By.id("cc_type"));
	    global.type(cardType, global.getData(1, 14));
	    WebElement expiryMont = driver.findElement(By.id("cc_exp_month"));
	    global.type(expiryMont, global.getData(1, 15));
	    WebElement expiryYear = driver.findElement(By.id("cc_exp_year"));
	    global.type(expiryYear, global.getData(1, 16));
	    WebElement cardCcv = driver.findElement(By.id("cc_cvv"));
	    global.type(cardCcv, global.getData(1, 17));
	    Thread.sleep(3000);
        WebElement btnBook = driver.findElement(By.id("book_now"));
	     global.click(btnBook);
	    Thread.sleep(6000);
		WebElement textOrderno1 = driver.findElement(By.xpath("(//input[@class='disable_text'])[15]"));
	//String attribute = textOrder1.getAttribute("value");
	//System.out.println(attribute);
		global.insertDataIntoExcel(1, 25, textOrderno1);
		global.closeallWindows();
        
}}
