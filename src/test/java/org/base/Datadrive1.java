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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datadrive1 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		File f=new File("C:\\Users\\elcot\\eclipse-workspace\\maven5\\test\\data.xlsx");
		FileInputStream stream= new FileInputStream(f);
		Workbook w=new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("sheet");
		
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String txtuser= cell.getStringCellValue();
		
		driver.findElement(By.id("email")).sendKeys(txtuser);
		File f1=new File("C:\\Users\\elcot\\eclipse-workspace\\maven5\\test\\data.xlsx");
		FileInputStream stream1= new FileInputStream(f1);
		Workbook w1=new XSSFWorkbook(stream1);
		Sheet sheet1 = w1.getSheet("sheet");
		
		
		Row row2 = sheet1.getRow(1);
		//Cell cell2 = row2.getCell(1);
        Cell cell2 = row2.getCell(0);
		String txtpwd = cell2.getStringCellValue();
		driver.findElement(By.id("pass")).sendKeys(txtpwd);
		
		
		
		
		
		
		
	}

}
