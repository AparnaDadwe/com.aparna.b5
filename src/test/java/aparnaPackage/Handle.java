
package aparnaPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle{

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
			
			driver.get("http://omayo.blogspot.com/");
			
			driver.manage().window().maximize();//this will maximize google chrome window
			
			//frame ke andar ka elemnt ke liye hame frame ke upar switch karna padta hai
			//switch to iframe
			
			WebElement frame=driver.findElement(By.xpath("//iframe[@id='navbar-iframe']"));
			 //switch to iframe
			 driver.switchTo().frame(frame);
			 
			 //get text from frame locator/weelemet
     	 System.out.println(driver.findElement(By.xpath("//a[@id='b-getorpost']")).getText());
//			 
	        driver.findElement(By.xpath("//a[@id='b-getorpost']")).click();
	        
	       Thread.sleep(5000);
			 
		     driver.navigate().back();
			WebElement textfield=driver.findElement(By.xpath("//textarea[@id='ta1']"));
			textfield.sendKeys("Welcome to selenium");
			 System.out.println(driver.getTitle());
			
		
	}

}
