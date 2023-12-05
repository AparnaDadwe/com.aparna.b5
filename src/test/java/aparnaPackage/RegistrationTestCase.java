package aparnaPackage;



import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aparna.b5.utility.Utility;

public class RegistrationTestCase {

	public static void main(String[] args) throws IOException {

		   WebDriver driver=new ChromeDriver();
		   
		   List<String> userDetails=Utility.readExcelFile();
			
			driver.get(Utility.getProperty("url"));
		   driver.manage().window().maximize();
		   //if u have test case is ur firstname field in regitration page is available and
		   //it is visible or displayed then what we do
		   WebElement firstName=driver.findElement(By.xpath("//input[@name='firstName']"));
		
//	            Dimension d=firstName.getSize(); //This is second method to find wheather
		                                      //webelement is displayed or not
//	             if  ( d.getHeight()>0) {
//	            	 
//	            	 System.out.print("WebElement is available or Dispalyed");
//	            	 
//	             }
		  System.out.println( firstName.isDisplayed());//isDisplayed() we can also displayed our 
		                                            //webelement is available it return true
		  System.out.println( firstName.getAttribute("name"));//getAttribute() yeh name attribute
		                                             //ke value ka nam print karkr dega
	
		   firstName.sendKeys(userDetails.get(0));
//		   driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(userDetails.get(0));
		   driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(userDetails.get(1));
		   driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(userDetails.get(2));
		   driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userDetails.get(3));
		   
	}

}
