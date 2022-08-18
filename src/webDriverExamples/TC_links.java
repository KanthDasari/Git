package webDriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_links {
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
			Thread.sleep(3000);
		List<WebElement>links = driver.findElements(By.tagName("a"));
		for(WebElement lks:links) {
			System.out.println(lks.getText());
			Thread.sleep(3000);
		}
		driver.close();
	}

}
