package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1Fb {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("subash");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("12345@13");
		WebElement btnClick = driver.findElement(By.xpath("//button[@type='submit']"));
		btnClick.click();
	}

}
