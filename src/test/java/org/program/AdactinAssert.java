package org.program;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.locator.LoginPage;
import org.locator.LoginPage1;
import org.locator.LoginPage2;
import org.locator.LoginPage3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sample.LibGlobal;



public class AdactinAssert extends LibGlobal {
	static LibGlobal global;
	LoginPage loginpage= new LoginPage();
	LoginPage1 loginpage1= new LoginPage1();
	LoginPage2 loginpage2= new LoginPage2();
	LoginPage3 loginpage3= new LoginPage3();
	
	@BeforeClass
	public static void beforeClassw() {
		 global=new LibGlobal();
		global.getDriver();
		global.loadUrl("https://adactinhotelapp.com/");
	}@Test
	public void tc0() throws IOException {
		//LoginPage loginPage=new LoginPage();
	WebElement txtUserName = loginpage.getTxtUserName();
		global.type(txtUserName, global.getData(1, 0));
		String attribute = txtUserName.getAttribute("value");
     	Assert.assertEquals("Mayilsamy", attribute);

	}@Test
	public void tc1() throws IOException {
		WebElement txtpassword = loginpage.getTxtpassword();
		global.type(txtpassword,global.getData(1, 1));
	//	String attribute = txtpassword.getAttribute("value");
		//Assert.assertEquals("");
	}@Test
	public void tc2() {
		WebElement btnLogin = loginpage.getBtnLogin();
		global.click(btnLogin);;

	}@Test
	public void tc3() throws IOException {
		WebElement Slctlocation = loginpage1.getSlctLocation();
		global.type(Slctlocation, global.getData(1, 2));
		String attribute = Slctlocation.getAttribute("value");
	   Assert.assertEquals(global.getData(1, 2),attribute);  

	}@Test
	public void tc4() throws IOException {
		WebElement SlctHotel = loginpage1.getSlctHotel();
		global.type(SlctHotel, global.getData(1, 3));
		String attribute = SlctHotel.getAttribute("value");
	   Assert.assertEquals(global.getData(1, 3),attribute);  

	}@Test
	 public void tc5() {
WebElement chkInDate = driver.findElement(By.id("datepick_in"));
global.clearText(chkInDate);
global.type(chkInDate, "15/08/2021");
Assert.assertEquals("15/08/2021",chkInDate.getAttribute("value"));
	}@Test
	 public void tc6() {
WebElement chkOutDate = driver.findElement(By.id("datepick_out"));
global.clearText(chkOutDate);
global.type(chkOutDate, "25/08/2021");
Assert.assertEquals("25/08/2021",chkOutDate.getAttribute("value"));
	}
	@Test
	public void tc7() throws IOException {
		WebElement slctRoomAdlt = loginpage1.getSlctRoomAdlt();
	    global.type(slctRoomAdlt, global.getData(1, 8));
	    String attribute = slctRoomAdlt.getAttribute("value");
	    Assert.assertEquals(global.getData(1, 8), attribute);
	    
	}@Test
	public void tc8() throws IOException {
WebElement slctRoomchild = loginpage1.getSlctRoomchild();
global.type(slctRoomchild, global.getData(1, 9));
String attribute = slctRoomchild.getAttribute("value");
Assert.assertEquals(global.getData(1, 9), attribute);
	}@Test
	public void tc9() {
WebElement slctSubmit = loginpage1.getSlctSubmit();
global.click(slctSubmit);
	}@Test
	public void tc10() {
WebElement slctbtnRadio = loginpage2.getSlctbtnRadio();
global.click(slctbtnRadio);
	}@Test
	public void tc11() {
WebElement slctContinue = loginpage2.getSlctContinue();
global.click(slctContinue);
	}
	@Test
	public void tc12() throws IOException {
	
	WebElement txtFirstName = loginpage3.getTxtFirstName();
    global.type(txtFirstName, global.getData(1, 10));
    String attribute = txtFirstName.getAttribute("value");
   Assert.assertEquals(global.getData(1, 10), attribute);
	}@Test
	public void tc13() throws IOException {
	
    WebElement txtLastName = loginpage3.getTxtLastName();
    global.type(txtLastName, global.getData(1, 11));
String attribute = txtLastName.getAttribute("value");
Assert.assertEquals(global.getData(1, 11),attribute);
	}@Test
	public void tc14() throws IOException {
    WebElement txtAdress = loginpage3.getTxtAdress();
    global.type(txtAdress, global.getData(1, 12));
    String attribute = txtAdress.getAttribute("value");
    Assert.assertEquals(global.getData(1, 12),attribute);
	}  @Test
	public void tc15() throws IOException {
    WebElement txtCardNumber = loginpage3.getTxtCardNumber();
    global.type(txtCardNumber, global.getData(1, 13));
    String attribute = txtCardNumber.getAttribute("value");
    Assert.assertEquals(global.getData(1, 13),attribute);
	}@Test
    public void tc16() throws IOException {
    WebElement txtCardType = loginpage3.getTxtCardType();
    global.type(txtCardType, global.getData(1, 14));
    String attribute = txtCardType.getAttribute("value");
    Assert.assertEquals(global.getData(1, 14),attribute);
	}@Test
    public void tc17() throws IOException {
    WebElement slectCardExpiryMnth = loginpage3.getSlectCardExpiryMnth();
    global.type(slectCardExpiryMnth, global.getData(1, 15));
    String attribute = slectCardExpiryMnth.getAttribute("value");
    Assert.assertEquals(global.getData(1, 15),attribute);
	}@Test
    public void tc18() throws IOException {
    
    WebElement slectCardExpiryYr = loginpage3.getSlectCardExpiryYr();
    global.type(slectCardExpiryYr, global.getData(1, 16));
    String attribute = slectCardExpiryYr.getAttribute("value");
    Assert.assertEquals(global.getData(1, 16),attribute);
	}@Test
    public void tc19() throws IOException {
    WebElement slectCardCvv = loginpage3.getSlectCardCvv();
    global.type(slectCardCvv, global.getData(1, 17));
    String attribute = slectCardCvv.getAttribute("value");
    Assert.assertEquals(global.getData(1, 17),attribute);
	}@Test
    public void tc20() {
    WebElement btnSelect = loginpage3.getBtnSelect();
    global.click(btnSelect);
	}
   // btnSelect.click();
 //   Thread.sleep(6000);
 //   WebElement textOrderno1 = driver.findElement(By.id("order_no"));
	//String attribute = textOrder1.getAttribute("value");
	//System.out.println(attribute);
	//	global.insertDataIntoExcel(1, 30, textOrderno1);
	
			
	
}


