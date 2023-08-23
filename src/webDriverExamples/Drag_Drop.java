package webDriverExamples;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		ChromeOptions obj = new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");	
		WebDriver driver = new ChromeDriver(obj);
		driver.get("https://jqueryui.com/droppable");
		assertEquals(driver.getTitle(),"Droppable | jQuery UI");
	System.out.println("title Matched");
	driver.switchTo().frame(0);
	Actions ac = new Actions(driver);
	ac.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
	Thread.sleep(3000);
	System.out.println("Drag&Drop");
	driver.switchTo().defaultContent();
	driver.close();
	}

}
