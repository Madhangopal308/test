package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadrive {

	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\Test\\data.xlsx");
		
		FileInputStream s=new FileInputStream(f);
		
		
		Workbook w=new XSSFWorkbook(s);
		
	Sheet sheet = w.getSheet("sheet0");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(0);
	
	String stringCellValue = cell.getStringCellValue();
	if(stringCellValue.equals("Java program"))
		cell.setCellValue("Selenium");
	
		
	/*	Sheet createSheet = w.createSheet();
		
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Java program");*/
		
		FileOutputStream stream=new FileOutputStream(f);
		w.write(stream);
		
		
		
	}

}
