package aparnaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorandScrolling {

	public static void main(String[] args) throws InterruptedException {
		
         WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
	// JavascriptExecutor is an interface we can not create object of interface so 
	//jo hamara webdriver ka driver hai usko	JavascriptExecutor ke sath typecast karo (JavascriptExecutor)driver
		JavascriptExecutor js =(JavascriptExecutor)driver;//js is the reference of JavascriptExecutor
		                                                  //interface
		//scroll vertical down (x,y) x ko 0 karo y ko +ve value de do
//		js.executeScript("window.scrollBy(0,1000)", "");// This  will scroll.. down the page by  1000 pixel vertical down
		
//		Thread.sleep(3000);
		//scroll vertical up (x,y) x ko 0 karo y ko -ve value de do
//     js.executeScript("window.scrollBy(0,-500)", "");// This  will scroll.. down the page 
                                                 //by  500 pixel vertical up
     
     //scroll horizontal right (x,y) right direction main scroll karna hai to x ko +ve value deto
     //aur y ko 0 vlaue de do
//     js.executeScript("window.scrollBy(100,0)", "");
     
//     Thread.sleep(3000);
     
   //scroll horizontal left (x,y) left direction scroll karna hai toh x ko -ve value de do 
//     js.executeScript("window.scrollBy(-50,0)", "");
     
//     js.executeScript("window.scrollBy(100,100)", "");//Both direction at a time
		
		//This will scroll the web page till end.
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//ScrollIntoView
		
//	WebElement dropdown=	driver.findElement(By.xpath("//button[text()='Dropdown']"));
		
		
		WebElement dropdown=	driver.findElement(By.xpath("//a[text()='Blogger']"));
		
		
	js.executeScript("arguments[0].scrollIntoView(true);",dropdown);
	dropdown.click();
	
	
	}

}
