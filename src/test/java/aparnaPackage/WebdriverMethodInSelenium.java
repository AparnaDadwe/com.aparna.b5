package aparnaPackage;
import java.util.Iterator;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethodInSelenium {
	
	public static void main(String args[]) {
		
		
       WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();//this will maximize google chrome window
		
//		driver.switchTo().newWindow(WindowType.TAB).get("http://google.com/");
//		
//		driver.switchTo().newWindow(WindowType.TAB).get("https://www.amazon.in/");
//		

//		
//		driver.manage().window().minimize();
		
//		driver.close(); // It close current windows
		
//		WebElement passwordTextBox=driver.findElement(By.xpath("/input[@name='pswrd']"));
//		
//		passwordTextBox.sendKeys("Password");
		
		//jitne bhi button hai unke text print karne ke liye list interface use kar rahe hai
		List<WebElement> button=driver.findElements(By.xpath("//button[@type='button']"));
		
		Iterator<WebElement> itr=button.iterator();
		
		// to see the number of button in webpage
		
		System.out.println("Number of buttons " +button.size());
		
		while(itr.hasNext()) {
			
			WebElement elm=itr.next(); // webelemnt ka text print karata hai
			
			System.out.println(elm.getText());
		
		}
		
		//to find multiple hipher link(href is attribute) in anchor tag 
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		
		for(WebElement elm:links) {
			
			System.out.println(elm.getAttribute("href")); // this will give all the attribute of 
			                                              // all link getAttribute it gives attribute
		}

		//getCurrentUrl method is used to get return current url
		
//		System.out.println(driver.getCurrentUrl());
//		
//		//getPageSurce method return complete page html source code
//		
////		System.out.println(driver.getPageSource());
//		
//		//getTitle method is used to get title of the web page
//		
//		System.out.println(driver.getTitle());
//		
//		//quit method  will quit all windows ex if there is
//		
////		driver.quit();
//		
//		//close method will close current focus and  controlled windows /tab
//		driver.close(); 
		
		
	
	}

}
