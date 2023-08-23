package webDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Google {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chromedriver\\chromedriver.exe");
		ChromeOptions obj = new ChromeOptions();
		obj.addArguments("-remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(obj);
		
      driver.get("https://www.google.com/");
      driver.findElement(By.name("q")).sendKeys("Selenium");
      Thread.sleep(4000);
      // driver.findElement(By.xpath("//*input[role='button'][type='submit']")).click();
     // driver.findElement(By.linkText("Sign in")).click();
      //driver.findElement(By.id("identifierId")).sendKeys("anwaruday790@gmail.com");
      driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
      Thread.sleep(4000);
      driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
      Thread.sleep(4000);
      driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}
