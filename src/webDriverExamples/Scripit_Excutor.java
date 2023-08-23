package webDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scripit_Excutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://183.82.103.245/nareshit/login.php");
		System.out.println(driver.getTitle());Thread.sleep(2000);
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");Thread.sleep(2000);
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");Thread.sleep(2000);
		//using JSE
		WebElement login = driver.findElement(By.name("Submit"));Thread.sleep(2000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();","login");

	}

}
