package webDriverExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class New_Excell {

	public static void main(String[] args) throws Exception {
		FileInputStream fileinput = new FileInputStream("C:\\Users\\Anwar\\OneDrive\\Documents\\Personal.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		System.out.println("Before Udating Cell Data" +sheet.getRow(2).getCell(1));
		XSSFCell cell = sheet.getRow(2).getCell(1);
		cell.setCellValue("New");
		fileinput.close();
		FileOutputStream fileout = new FileOutputStream("C:\\Users\\Anwar\\OneDrive\\Documents\\Personal.xlsx");
		workbook.write(fileout);
		System.out.println("Updated data after write is done" + cell.getStringCellValue());
		fileout.close();

	}

}
