package com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.navigate().to("https://www.catch.com.au/");
driver.manage().window().maximize();


String ParentWindow =driver.getWindowHandle();
driver.findElement(By.className("css-5tdk5s")).click();
System.out.println("click on Hello");
Set<String>allwindows=driver.getWindowHandles();
Iterator<String>itr=allwindows.iterator();
while(itr.hasNext()) {
	String window =itr.next();
	driver.switchTo().window(window);
	if(driver.getTitle().equals("Catch.com.au")){
		
		driver.findElement(By.xpath("(//img[@class='c3badb680 c1304753b'])[1]"));
		driver.findElement(By.linkText("Terms and Conditions")).click();

	}
			
}
System.out.println( "");
driver.navigate().back();
driver.findElement(By.id("username")).sendKeys("abc");
driver.quit();


	}

}
