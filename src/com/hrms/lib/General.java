package com.hrms.lib;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import com.hrms.utility.Log;


public class General extends Global {
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chromedriver\\chromedriver.exe");
		ChromeOptions n=new ChromeOptions();
		n.addArguments("remote--allow-origins=*");
		driver = new ChromeDriver(n);
		driver.navigate().to(url);
		System.out.println("Application opened");
		Reporter.log("Application opened");
		Log.info("Application opened");
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application closed");
		Log.info("Application closed");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
		Log.info("Login completed");
	}
	
	public void enterFrame() {
		driver.switchTo().frame(frm_frame);
		System.out.println("Entered into frame");
		Log.info("enter ftrame");
	}
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		Log.info("exit frame");
	}
	public void addNewEmp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_EFN)).sendKeys(FN);
		driver.findElement(By.name(txt_ELN)).sendKeys(PW);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("New Emp Added");
		Log.info("add emp");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Log.info("Logout completed");
	}

}
