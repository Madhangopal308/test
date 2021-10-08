package org.base;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	  public static void main(String[] args) throws IOException {
		
          File f=new File("C:\\Users\\elcot\\eclipse-workspace\\maven5\\test\\Book1.xlsx");
          
          FileInputStream stream=new FileInputStream(f);
          
          Workbook w=new XSSFWorkbook(stream);
          
          Sheet sheet = w.getSheet("excel");
          
          int physical = sheet.getPhysicalNumberOfRows();
          System.out.println(physical);
          
         
          for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
        	  Row row = sheet.getRow(i);
       
        	  
        	  for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
        		  Cell cell = row.getCell(j);
        		// String text = cell.getStringCellValue();
        		  //System.out.println(text);
        		  int cellType = cell.getCellType();
        		  if(cellType==1)
        		  {
        			  String stringCellValue = cell.getStringCellValue();
        			  System.out.println(stringCellValue);
        			  
        		  }
        		  
        		  else if(DateUtil.isCellDateFormatted(cell))
        		  
        		  {
        			  Date dateCellValue = cell.getDateCellValue();
        			  System.out.println(dateCellValue);
        			  SimpleDateFormat d=new SimpleDateFormat("DD/MM/YYYY");
        			  String format = d.format(dateCellValue);
        			  System.out.println(format);
        			  
        			  
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
