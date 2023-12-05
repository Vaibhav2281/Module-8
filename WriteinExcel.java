package excellllllllllllll;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteinExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("TestSheet");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Vaibhav");
		sheet.getRow(0).createCell(1).setCellValue("Badheka");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Sam");
		sheet.getRow(1).createCell(1).setCellValue("Patel");
		
		File file1=new File("C:\\Users\\Vaibhav\\eclipse-workspace1\\excellearning\\excelfiles\\Test11.xlsx");
		FileOutputStream fio=new FileOutputStream(file1);
		workbook.write(fio);
		fio.close();
		workbook.close();
		System.out.println("Workbook created successfully");
	}

}
