
package aparnaPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleElementFromFrame{

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			
			driver.get("http://omayo.blogspot.com/");
			
			driver.manage().window().maximize();//this will maximize google chrome window
			
			//frame ke andar ka elemnt ke liye hame frame ke upar switch karna padta hai
			//switch to iframe
			
			WebElement frame=driver.findElement(By.xpath("//iframe[@id='navbar-iframe']"));
			
			driver.switchTo().frame(frame);
			
//         	driver.findElement(By.xpath("//a[@id='b-getorpost']")).click();//click karne ke bad 
			             //page open hona chahiye par hame ya exception ata hai kyonki hamara anchor
         	//tag yeh iframe tag main hai to hame pahile frame main switch karna hoga 
			
		System.out.println(driver.findElement(By.xpath("//a[@id='b-getorpost']")).getText());
			//getText() is method se hamne webelent ka text le liya
	
//	//switching back to your parent page when our current control in iframe tag
	
	driver.switchTo().defaultContent();
	
	WebElement textfield=driver.findElement(By.xpath("//textarea[@id='ta1']"));
	//ya ha pain hamne text box ka locator likha hai aur vaha pain hame text send karna hai senKeys 
	//method se
	
	textfield.sendKeys("Welcome to Selenium Webdriver");
	
System.out.println(driver.getTitle()); // we can check our control on which page by
	                                       //getTitle() method when we want to switch another page

	}

}
