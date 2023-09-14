package com.aadhar.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AadharCitizen {
	static WebDriver webdriver = null;

	@Test
	public void ChromeBrowser() {
		webdriver = new ChromeDriver();
		webdriver.manage().window().maximize();
		System.out.println("Chrome Browser is Opened!!");

	}

	@Test
	public void CitizenCheck() {
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

		webdriver.get("http://localhost:4200/user-login");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webdriver.findElement(By.id("citizen_id")).sendKeys("1");
		webdriver.findElement(By.id("password")).sendKeys("9457302259");
		webdriver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	}

}