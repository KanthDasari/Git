package testngExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testng2 {
	WebDriver driver;
	@BeforeClass
	public void login() {
		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chromedriver\\chromedriver.exe");
		ChromeOptions obj = new ChromeOptions();
		obj.addArguments("remote--allow-origins=*");
		 driver = new ChromeDriver(obj);
		driver.get("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
	}
	@AfterClass
	public void logout() {
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
	}
	@Test
	public void addemp() {
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Anwar");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Udayagiri");
		driver.findElement(By.id("btnEdit")).click();
		driver.switchTo().defaultContent();
		System.out.println("Add Emp");
		
	}
	@Test
	public void delemp() {
		System.out.println("Del Emp");
	}

}
