package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant {

	public static String getCellValue(String sheet_path, String sheet_name, int row, int cell) throws IOException {

		FileInputStream fis = new FileInputStream(sheet_path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String cellValue = wb.getSheet(sheet_name).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;
	}

}
