package testngExample;
import org.testng.annotations.Test;
public class Testng1 {

		@Test
		public void login() {
			System.out.println("Login Completed");
			
		}
		@Test
		public void logout() {
			System.out.println("Logout Completed");
		}
		@Test
		public void addemp() {
			System.out.println("Add Employe");
		}
		@Test
		public void delemp() {
			System.out.println("Delete Employe");
		}

	}



