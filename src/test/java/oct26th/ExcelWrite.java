package oct26th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
	FileInputStream fis=new FileInputStream("D:\\java_selenium\\softwares\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet3");
		
		//ws.getRow(1).getCell(1).setCellValue("New FLM");
		
		//ws.getRow(2).createCell(1).setCellValue("pass");
		
		ws.createRow(3).createCell(0).setCellValue("New Line");
		
		FileOutputStream fos=new FileOutputStream("D:\\java_selenium\\softwares\\Book1.xlsx");
		
		wb.write(fos);
		
		wb.close();
		
		System.out.println("End of Program");

	}

}
