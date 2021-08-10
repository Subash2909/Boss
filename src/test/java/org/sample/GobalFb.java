package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GobalFb {
	public static void main(String[] args) throws IOException {
		LibGlobal global=new LibGlobal();
		WebDriver driver = global.getDriver();
		global.loadUrl("https://en-gb.facebook.com/");
		  String currentUrl = global.currentUrl();
		  System.out.println(currentUrl);
	    WebElement txtUser = driver.findElement(By.id("email"));
	    global.type(txtUser, "Boss");
	    global.screenShot("browser");
	    
	    String attribute2 = global.getAttribute(txtUser);
	    System.out.println(attribute2);
	    WebElement txtPass = driver.findElement(By.id("pass"));
	global.type(txtPass, "Boss@123");
    String attribute = global.getAttribute(txtPass);
    System.out.println(attribute);
    WebElement btnlogin = driver.findElement(By.name("login"));
    global.click(btnlogin);
   // global.currentUrl();
    global.closeallWindows();
	
	}

}
