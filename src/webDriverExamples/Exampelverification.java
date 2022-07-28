package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Exampelverification {
	static String url="http://183.82.103.245/nareshit/login.php";
	static String username = "nareshit";
	static String password = "nareshit";
	static String title1 = "OrangeHRM-NEW Level OF HR Management";
	static String title2 = "OrangeHRM";
	public static void main (String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		//test steps for Verification
		if(driver.getTitle().equals(title1)) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title Not Matched");
			System.out.println("driver.getTitle()");
		}
		
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Loin Completed");
		Thread.sleep(3000);
		if(driver.getTitle().equals(title2)){
			System.out.println("Title Matched");
		}
		else{
			System.out.println("Title Not Matched");
			System.out.println("driver.getTitle()");
			
		}
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
