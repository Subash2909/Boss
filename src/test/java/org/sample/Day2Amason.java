package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2Amason {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/amazonprime?_encoding=UTF8&ref_=nav_cs_primelink_nonmember_2860122b63884a8688052dc445e46bd9");
WebElement txtbox = driver.findElement(By.id("twotabsearchtextbox"));
txtbox.sendKeys("iphone",Keys.ENTER);
List<WebElement> slect = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
for (int i = 0; i < slect.size(); i++) {
	WebElement name = slect.get(i);
	String text = name.getText();
	System.out.println(text);
	
}driver.quit();
}

}
