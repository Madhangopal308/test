package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testdata {

	public static void main(String[] args) throws IOException {
		
		File f =new File("C:\\Users\\elcot\\eclipse-workspace\\maven5\\test\\test.xlsx");
		FileInputStream stream=new FileInputStream(f);
		
		
		Workbook w=new XSSFWorkbook(stream);
		
		Sheet sheet = w.getSheet("abc");
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		
		for (int i = 0; i <physicalNumberOfRows;  i++) {
			Row row = sheet.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			//System.out.println(physicalNumberOfCells);
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
				
				int cellType = cell.getCellType();
				if(cellType==1)
				{
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
				else
				{
					double numericCellValue = cell.getNumericCellValue();
					System.out.println(numericCellValue);
					long l=(long)numericCellValue;
					System.out.println(l);
				}
				
			}
			
		}
		
		
	}

}
