package webDriverExamples;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Database {
	public static void main(String args[])  throws Exception{
		String dburl = "jdbc:Oracle:thin:@localhost:1521:xe";
		String dbun = "system";
		String dbpw = "SYS231";
		
		Connection con = DriverManager.getConnection(dburl,dbun,dbpw);
		Statement st = con.createStatement();
		ResultSet res = st.executeQuery("select * from empid");
		while(res.next()) {
			String un = res.getString(1);
			System.out.println(un);
			String pw = res.getString(2);
			System.out.println(pw);
			
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
			driver.findElement(By.name("txtUserName")).sendKeys(un);
			driver.findElement(By.name("txtPassword")).sendKeys(pw);
			Thread.sleep(3000);
			driver.findElement(By.name("Submit")).click();
			driver.findElement(By.linkText("Logout")).click();
			driver.close();
			
		}
		res.close();
		st.close();
		con.close();
	}

}
