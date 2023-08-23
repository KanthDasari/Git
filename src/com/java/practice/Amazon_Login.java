package com.java.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon_Login {

	public static void main(String[] args) throws Exception  {
		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chromedriver\\chromedriver.exe");
		//ChromeOptions obj = new ChromeOptions();
		//obj.addArguments("-remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/log/s?k=log+in");
		Thread.sleep(3000);
		//Login
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("9515878941");
		Thread.sleep(3000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Anwar231@");
		Thread.sleep(3000);
		driver.findElement(By.id("signInSubmit")).click();
		System.out.println("Login Completed");
		Thread.sleep(3000);
		//currency Change
		driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='icp-currency-dropdown-selected-item-prompt']/span/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"icp-currency-dropdown_44\"]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"icp-save-button\"]/span/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='All'][@class='hm-icon-label']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Amazon Music")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[1]/a")).click();
		Thread.sleep(3000);
		//Select Electronics
		driver.findElement(By.linkText("Electronics")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Headphones")).click();
		Thread.sleep(3000);
		//selecting product
		//search product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus nord buds");
		System.out.println("Searching");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[text()='ONEPLUS Nord Buds True Wireless Earbuds, Deep Bass, IP55-rated Water & Dust Resistance, High Sound and Call Quality, 4 Mics, 30 Hrs Playtime, Fast Charge, Dolby Atmos, Black Slate']")).click();
		Thread.sleep(3000);
//	    driver.findElement(By.xpath("//*[@id=\"contextualIngressPtLabel\"]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\'GLUXCountryListDropdown\']/span/span")).click();
//		driver.findElement(By.id("GLUXCountryList_106")).click();
//		driver.findElement(By.xpath("//*[@id='GLUXZipUpdateInput']")).sendKeys("500016");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(" //input[@class='a-button-input'][@aria-labelledby='GLUXZipUpdate-announce']")).click();
//		Thread.sleep(3000);
		//driver.close();
		
		
 
	}

}
