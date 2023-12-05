package aparnaPackage;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandlingConcept {

	public static void main(String[] args) {
		
	       WebDriver driver=new ChromeDriver();
			
			driver.get("http://omayo.blogspot.com/");
			
			driver.manage().window().maximize();//this will maximize google chrome window
			
			WebElement textfield=driver.findElement(By.xpath("//textarea[@id='ta1']"));
			
			textfield.sendKeys("Welcome to Selenium");
			
			driver.findElement(By.xpath("//a[@id='selenium143']")).click();

		System.out.println(driver.getTitle());// it will return title of current windoe /tab
		
		            	
		// clear method is used to clear text box of text and search box text
		
	      textfield.clear();
	  
//	  //getWindowHandle will handle current window
//	  
	  String parenWindowJandle=driver.getWindowHandle();// it will return current window handle
	                                           //current page, current tab ka handle in the form of 
		                                           // string
	  
	  //getWindowHandles will handle multiple window /tab
       Set<String> allWindowsHAndle=driver.getWindowHandles();// it will handle all windows
	  
      for(String handle:allWindowsHAndle) {
			  
	  if(!(handle.equals(parenWindowJandle))) {
		  
		  driver.switchTo().window(handle);
	  }
		 
		  } 
    	driver.findElement(By.xpath("//a[text()='What is Selenium?']")).click();//when we click on
    	                            //this it will not click because our control on parent page
    	                           //so we have to switch control to another page 
    	                           //What is Selenium? he tyach pagewar open hotay
    	                           // dusrya nhi
      
//    	  //3rd window or page
//    	  
//	      driver.findElement(By.xpath("//a[@id='sc_counter_9037253']")).click();
//	      
//	      allWindowsHAndle=driver.getWindowHandles();
//	      
//	      
//	     //		  //again we have to switch to our parent window
////	             driver.switchTo().window(parenWindowJandle);
//////		  
////	           textfield.sendKeys("Back to Selenium");//again we have to send text on parent page
////	                              //without switch to parent we cannot do this because our control
////	                              //on other tab so again switch to parent window
////		  

	}

}
