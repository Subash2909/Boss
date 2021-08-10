package org.program;

import javax.security.auth.login.LoginContext;

import org.locator.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sample.LibGlobal;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleBrowser extends LibGlobal{
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver(); 
    driver.manage().window().maximize();
    driver.get("https://adactinhotelapp.com/");
    LoginPage loginPage=new LoginPage();
    WebElement txtUserName = loginPage.getTxtUserName();
    txtUserName.sendKeys("Mayilsamy");
    WebElement txtpassword = loginPage.getTxtpassword();
    txtpassword.sendKeys("6QXF2G");
    WebElement btnLogin = loginPage.getBtnLogin();
    btnLogin.click();
    
    
	driver.quit();
}
}
