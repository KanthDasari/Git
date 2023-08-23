package com.java.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chromedriver\\chromedriver.exe");
		ChromeOptions obj = new ChromeOptions();
		obj.addArguments("-remote-allow-origins=*");
		WebDriver A = new ChromeDriver(obj);
		A.get("https://www.amazon.com/log/s?k=log+in");
		A.findElement(By.name("field-keywords")).sendKeys("one plus Nord buds");
		Thread.sleep(3000);
	    A.findElement(By.id("nav-search-submit-button")).click();
	    A.findElement(By.xpath("//span[text()='ONEPLUS Nord Buds True Wireless Earbuds, Deep Bass, IP55-rated Water & Dust Resistance, High Sound and Call Quality, 4 Mics, 30 Hrs Playtime, Fast Charge, Dolby Atmos, Black Slate']")).click();
	    A.findElement(By.xpath("//*[@id=\"abb_accessory_add_button_B07RCX9YXY\"]/span/input")).click();
	    Thread.sleep(3000);
	    A.findElement(By.id("nav-cart-count")).click();
	    Thread.sleep(3000);
	    A.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
	    Thread.sleep(3000);
	    A.findElement(By.linkText("0 (Delete)")).click();
	    A.close();
	  
	}

}
