package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.catch.com.au/");
String url1 =driver.getTitle();
System.out.println(url1 );
String url =driver.getCurrentUrl();
System.out.println(url);
driver.findElement(By.xpath("//a[@id='menu-bar-item-1']//*[name()='svg']//*[name()='path' and contains(@d,'M23.677 4.')]//following::h5[normalize-space()='Clearance']")).click();
System.out.println("click on track my order");




//driver.findElement(By.xpath("//div[@class='css-5vx1lk e1v2ac3o1']//div[@class='css-efv112']//*[name()='svg']/..//*[name()='path']")).click();
	driver.findElement(By.xpath("//a[@id='menu-bar-item-1']//*[name()='svg']//*[name()='path' and contains(@d,'M23.677 4.')]//following::h5[normalize-space()='Clearance']")).click();
	System.out.println("click on clearence tab");
	WebElement shopCategories = driver.findElement(By.xpath("//span[contains(text(),'Shop All Categories')]"));

	//Creating object of an Actions class
	Actions action = new Actions(driver);

	//Performing the mouse hover action on the target element.
	action.moveToElement(shopCategories).perform();
	driver.findElement(By.xpath("//span[contains(text(),'Shop All Categories')]")).click();
	System.out.println("click on Shop all categories");
	driver.get("https://www.catch.com.au/shop/womens-fashion/");
	WebElement Womens =driver.findElement(By.xpath("//img[@alt=\"Women's Apparel Clearance\"]"));
	action.moveToElement(Womens).click();
	System.out.println("click on womens");
	driver.navigate().back();
	System.out.println("navigate to home page");
	
	List<WebElement> sizeOfHadertabs =driver.findElements(By.xpath("//div[@class='css-95xr69']"));
	for(WebElement e :sizeOfHadertabs) {
		System.out.println(e.getText());
		//System.out.println(sizeOfHadertabs.size());
	}
	
	//driver.quit();
	//driver.close();
	
	
	
	}

}
