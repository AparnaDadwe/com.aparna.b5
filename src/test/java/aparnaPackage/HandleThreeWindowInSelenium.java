package aparnaPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleThreeWindowInSelenium {

	public static void main(String[] args) {
		
		
	       WebDriver driver=new ChromeDriver();
			
			driver.get("http://omayo.blogspot.com/");
			
			driver.manage().window().maximize();//this will maximize google chrome window
			
		WebElement textfield=	driver.findElement(By.xpath("//textarea[@id='ta1']"));
		
		textfield.sendKeys("Multiple Handling Webpage in Selenium");//1st window open
		
		  driver.findElement(By.xpath("//a[@id='selenium143']")).click();//2nd window open
		  
		  
		
		  //getWindowHandle() handle current window handle
		  String  parentWindowHandle=driver.getWindowHandle();
		 
		  Set<String> allWindowsHAndle=driver.getWindowHandles();// it will handle all windows
		  
	      for(String handle:allWindowsHAndle) {
				  
		  if(!(handle.equals(parentWindowHandle))) {
			  
			  driver.switchTo().window(handle);
		  }
			 
			  } 
//	      allWindowsHAndle=driver.getWindowHandles();
//		  
//		  for(String awHandle:allWindowsHAndle){
//			  
//			  if(!(awHandle.equals(parentWindowHandle))) {
//				  
//				  driver.switchTo().window(awHandle);
//				  
//				  if(!(driver.getTitle().equals("Selenium143")) ){
//					  
//					  continue;
//				  }
//		
//	                }
//			 
//		  }
		  driver.findElement(By.xpath("//a[@id='sc_counter_9037253']")).click();//3rd window open
		  System.out.println(driver.getTitle());
		  driver.switchTo().window(parentWindowHandle);
		  textfield.sendKeys("Back to PAren Window");
	
	}

}
