package com.aparna.b5.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {

	public static String getProperty(String key) throws IOException {
		
		File file= new File("src/test/resources/Data.properties");
		FileInputStream fileInputStream=new FileInputStream(file);
		Properties properties=new Properties();
		properties.load(fileInputStream);
		return properties.getProperty(key);
		 
		
	}
	
	public static void getscreenShot(WebDriver driver, String name) throws IOException {
		
		TakesScreenshot  takesscreeShot=(TakesScreenshot)driver;
		   File file=	takesscreeShot.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("src/test/resources/screenshotimage/"  + name +".png"));
		
	}
	
	public  void selectCountry(WebDriver driver, String countryName) throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@id='select-country-dropdown']")).click();
		Thread.sleep(1000);
		List<WebElement>countries=driver.findElements(By.xpath("//div[@id='modal-list-country']//ul//li//span"));
		
		for(WebElement country:countries) {
			
			if(country.getText().equalsIgnoreCase(countryName)) {
				
				country.click();
			}
		}
	}
	
	public static  List<String>readExcelFile() throws IOException {
		//excel se data read karna hai to File naam ka class hai hum File naam ke class
		//ka object banyge usme hamara resource path dalenge jo yeh us file ko java programming main repesent 
		//karta hai
		File file=new File("src/test/resources/registerData.xls");
		//represent karne ke bad excel file read karna to FileInputStream class hai uska object banake
		//file ka object as a parameter pass karenge konsi bhi file read karne ke liye stream ko connect karna
		//padta hai
		FileInputStream fileInputStream=new FileInputStream(file); 
		
		List<String> userRegistrationDetails=new ArrayList<String>();
		
		//pura excel sheet read karne ke liye hamare pas HSSFWorkbook class hai uska object banake'
		//ham fileInputStream ka object pass karenge
		
		HSSFWorkbook hssfWorkbook=new HSSFWorkbook(fileInputStream);
		
		//getSheetAt(0) yeh method 0th index main jo sheet hogi woh return karenga
		//HSSFSheet yeh ek class hai jo hamare sheet ko represent karta hai
		
		HSSFSheet sheet=hssfWorkbook.getSheetAt(0);
		//getLastRowNum() yrh method last row ka number milta hai
		
		int lastRowNumber=sheet.getLastRowNum();
		
		int lastCellNumber=0;//lastCellNumber hamne 0 se start kiya
		//for(int i=0;i<=lastRowNumber;i++) --- yeh excel sheet ka header dikhata hai first name etc
		for(int i=1;i<=lastRowNumber;i++)//yaha pain firstname ke value , lastname ke value aa jayenge
		   {
			HSSFRow row=sheet.getRow(i);// ek ek row iterate hoga
			lastCellNumber=	row.getLastCellNum(); //row ke andar cell  hote hai isliye  getLastCellNum() method
			for(int j=0;j<lastCellNumber;j++) //it will iterate all cell inside the row
			{
//			System.out.println(row.getCell(j).getStringCellValue());
			//getCell() yeh respective index ka cell lega usmese getStringCellValue() yeh method
			//call karne padte hai
				userRegistrationDetails.add(row.getCell(j).getStringCellValue());	
				
			}
		}
		return userRegistrationDetails;
	}
}
