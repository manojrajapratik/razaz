package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Check {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("D://new Excel Sheet.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		System.out.println(wb.getSheet("raja").getRow(3).getCell(1).getStringCellValue());

	}

}
