package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;


public class Test {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://sakshingp.github.io/assignment/login.html");
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).sendKeys("abc");
		driver.findElement(By.id("password")).sendKeys("abc");
		driver.findElement(By.id("log-in")).click();
		
		Thread.sleep(3000);
	
		System.out.println("login completed");

		Actions ac = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id='amount']"));
		
		ac.moveToElement(element).click().perform();
		
		System.out.println("Amount sorted successfully");

		Thread.sleep(5000);
		driver.close();
		
	}

}
