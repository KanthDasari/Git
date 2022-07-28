package webDriverExamples;
import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class Excel{
	public static void main (String args[])throws Exception {
	FileInputStream file = new FileInputStream("E:\\Selenium\\Excel\\Book1.xls");
	Workbook wb = Workbook.getWorkbook(file);
	int row=2;

	
		
	}

}
