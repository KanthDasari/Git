package webDriverExamples;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Example2 {
	public static void main(String args[]) throws Exception{
		//main steps
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("rightMenu");
		Thread.sleep(5000);
		Select st = new Select(driver.findElement(By.name("loc_code")));
		Thread.sleep(5000);
		st.selectByValue("0");
		Thread.sleep(5000);
		driver.findElement(By.name("loc_name")).sendKeys("0391");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("chkLocID[]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);
		driver.close();
		
	}

}
