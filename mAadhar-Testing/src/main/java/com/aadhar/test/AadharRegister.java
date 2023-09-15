package com.aadhar.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AadharRegister {
	public WebDriver webdriver;

	@Test
	public void ChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		webdriver = new ChromeDriver();
		webdriver.manage().window().maximize();
		System.out.println("Chrome Browser is Opened!!");

	}

	@Test
	public void TestHome() {
		webdriver.get("http://localhost:4200/login");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		webdriver.findElement(By.xpath("//div[@class='login-container']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webdriver.get("http://localhost:4200/user-register");

		webdriver.findElement(By.id("name")).sendKeys("Ayush Garg");
		webdriver.findElement(By.id("dob")).sendKeys("16/01/1996");
		webdriver.findElement(By.id("emailid")).sendKeys("gargayush1696@gmail.com");
		webdriver.findElement(By.id("address")).sendKeys("Janakpuri, Deoband");
		webdriver.findElement(By.id("mobileno")).sendKeys("9878765432");
		webdriver.findElement(By.id("gender")).sendKeys("Male");
	}

}
