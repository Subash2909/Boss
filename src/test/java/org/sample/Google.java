package org.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
	public static void main(String[] args) {
		LibGlobal global=new LibGlobal();
		WebDriverManager.chromedriver().setup();;
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		WebElement moCourse = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		Actions action=new Actions(driver);
		//action.moveToElement(moCourse).perform();
		global.mouse(action, moCourse);
	}
}
