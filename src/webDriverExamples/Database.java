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
		String dbpw = "aruna";
		
		Connection con = DriverManager.getConnection(dburl,dbun,dbpw);
		
		
		Statement st = con.createStatement();
		ResultSet res = st.executeQuery("select * from jyo");
		while(res.next()) {
			
			String un = res.getString(1);
			System.out.println(un);
			String pw = res.getString(2);
			System.out.println(pw);
			
			String pw1 = res.getString(3);
			System.out.println(pw1);
			String pw11 = res.getString(4);
			System.out.println(pw11);
			String pw2 = res.getString(5);
			System.out.println(pw2);
			String pw3 = res.getString(6);
			System.out.println(pw3);
			//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
//			driver.findElement(By.name("txtUserName")).sendKeys(un);
//			driver.findElement(By.name("txtPassword")).sendKeys(pw);
//			Thread.sleep(3000);
//			driver.findElement(By.name("Submit")).click();
//			driver.findElement(By.linkText("Logout")).click();
//			driver.close();
			
		}
		res.close();
		st.close();
		con.close();
	}

}

