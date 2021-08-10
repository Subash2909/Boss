package org.program;

import java.io.IOException;

import org.locator.LoginPage;
import org.locator.LoginPage1;
import org.locator.LoginPage2;
import org.locator.LoginPage3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sample.LibGlobal;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinPage extends LibGlobal{
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriverManager.chromedriver().setup();
	LibGlobal global=new LibGlobal();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");
	LoginPage loginpage= new LoginPage();
	LoginPage1 loginpage1= new LoginPage1();
	LoginPage2 loginpage2= new LoginPage2();
	LoginPage3 loginpage3= new LoginPage3();
	WebElement txtUserName = loginpage.getTxtUserName();
	global.type(txtUserName, global.getData(1, 0));
	WebElement txtpassword = loginpage.getTxtpassword();
	txtpassword.sendKeys("KXV721");
	//global.type(txtpassword, global.getData(1, 1));
	WebElement btnLogin = loginpage.getBtnLogin();
	global.click(btnLogin);
	WebElement slctLocation = loginpage1.getSlctLocation();
	global.type(slctLocation, global.getData(1, 2));
	//slctLocation.sendKeys("Sydney");
	WebElement slctHotel = loginpage1.getSlctHotel();
	global.type(slctHotel, global.getData(1, 3));
	//slctHotel.sendKeys("Hotel Sunshine");
	WebElement slctRoomType = loginpage1.getSlctRoomType();
	global.type(slctRoomType, global.getData(1, 4));
	//slctRoomType.sendKeys("Super Delex");
	WebElement slctroomno = loginpage1.getSlctroomno();
	global.type(slctroomno, global.getData(1, 5));
	//slctroomno.sendKeys("1-One");
	WebElement slctRoomAdlt = loginpage1.getSlctRoomAdlt();
	global.type(slctRoomAdlt, global.getData(1, 8));
	//slctRoomAdlt.sendKeys("1-One");
	WebElement slctRoomchild = loginpage1.getSlctRoomchild();
	global.type(slctRoomchild, global.getData(1, 9));
//	slctRoomchild.sendKeys("1-One");
	WebElement slctSubmit = loginpage1.getSlctSubmit();
	global.click(slctSubmit);
//	slctSubmit.click();
	WebElement slctbtnRadio = loginpage2.getSlctbtnRadio();
	global.click(slctbtnRadio);
	//slctbtnRadio.click();
	WebElement slctContinue = loginpage2.getSlctContinue();
	global.click(slctContinue);
	//slctContinue.click();
    WebElement txtFirstName = loginpage3.getTxtFirstName();
    global.type(txtFirstName, global.getData(1, 10));
   // txtFirstName.sendKeys("boss");
    WebElement txtLastName = loginpage3.getTxtLastName();
    global.type(txtLastName, global.getData(1, 11));
    //txtLastName.sendKeys("s");
    WebElement txtAdress = loginpage3.getTxtAdress();
    global.type(txtAdress, global.getData(1, 12));
    //txtAdress.sendKeys("chennai");
    WebElement txtCardNumber = loginpage3.getTxtCardNumber();
    global.type(txtCardNumber, global.getData(1, 13));
   // txtCardNumber.sendKeys("1236459878954562");
    WebElement txtCardType = loginpage3.getTxtCardType();
    global.type(txtCardType, global.getData(1, 14));
    //txtCardType.sendKeys("American Express");
    WebElement slectCardExpiryMnth = loginpage3.getSlectCardExpiryMnth();
    global.type(slectCardExpiryMnth, global.getData(1, 15));
    //slectCardExpiryMnth.sendKeys("September");
    WebElement slectCardExpiryYr = loginpage3.getSlectCardExpiryYr();
    global.type(slectCardExpiryYr, global.getData(1, 16));
    //slectCardExpiryYr.sendKeys("2022");
    WebElement slectCardCvv = loginpage3.getSlectCardCvv();
    global.type(slectCardCvv, global.getData(1, 17));
    //slectCardCvv.sendKeys("125");
    WebElement btnSelect = loginpage3.getBtnSelect();
    global.click(btnSelect);
    btnSelect.click();
    Thread.sleep(6000);
    WebElement textOrderno1 = driver.findElement(By.id("order_no"));
	//String attribute = textOrder1.getAttribute("value");
	//System.out.println(attribute);
		global.insertDataIntoExcel(1, 30, textOrderno1);
		global.closeallWindows();
        
    
}
}
