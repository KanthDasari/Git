package webDriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Example2 {
	public static void main(String args[]) throws Exception{
		//main steps
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		ChromeOptions n = new 	ChromeOptions();
		n.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(n);
	
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
		driver.findElement(By.name("loc_name")).sendKeys("6039");
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
