package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementReferanceException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.catch.com.au/");
		driver.manage().window().maximize();
		List<WebElement>alllinks=driver.findElements(By.xpath("//a"));
		for(WebElement e:alllinks) {
			
			System.out.println(e.getAttribute("href"));
		}
		
		//driver.findElement(By.tagName("//"));
		
		
		
		
	}

}
