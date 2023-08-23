package webDriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

public class New_one {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(4000);
		Screen sc = new Screen();
		sc.click("C:\\Users\\Anwar\\OneDrive\\Documents\\Allow.png");

	}

}
