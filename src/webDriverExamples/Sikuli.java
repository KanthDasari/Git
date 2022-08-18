package webDriverExamples;

import org.sikuli.script.Screen;

public class Sikuli {
	public static void main(String args[]) throws Exception{
		Screen obj = new Screen();
		
		obj.click("C:\\Users\\Anwar\\eclipse-workspace\\Seleniumwithjava\\Images\\minum.png");
		
		Thread.sleep(3000);
		obj.doubleClick("C:\\Users\\Anwar\\eclipse-workspace\\Seleniumwithjava\\Images\\pc.png");
		
		Thread.sleep(3000);
		
		obj.click("E:\\Selenium\\Sikuli img\\minu.png");
	}

}
