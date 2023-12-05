package comexcel;

import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateAndWriteExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		HSSFWorkbook workbook=new HSSFWorkbook();
		HSSFSheet sheet=workbook.createSheet("TestSheet");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Vaibhav");
		sheet.getRow(0).createCell(1).setCellValue("Badheka");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Sam");
		sheet.getRow(1).createCell(1).setCellValue("Patel");
		
		File file=new File("C:\\Users\\Vaibhav\\eclipse-workspace1\\excellearning\\excelfiles\\Test12.xls");
		FileOutputStream f1=new FileOutputStream(file);
		workbook.write(file);
		f1.close();
		workbook.close();
		System.out.println("Workbook created successfully");
	}

}
