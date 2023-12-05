package aparnaPackage;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aparna.b5.utility.Utility;
public class LoginUsingProperties {
	
	@Test

	public void verifyTitle()  throws IOException {
		
       WebDriver driver=new ChromeDriver();
		
		driver.get(Utility.getProperty("url"));
		
	   driver.manage().window().maximize();
	   
	   driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(Utility.getProperty("userName"));
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Utility.getProperty("passWord"));
	   driver.findElement(By.xpath("//input[@name='submit']")).click();
	   
	   //ya ha readExcelFile() method call karni papdegi excel data read karni hai toh
	   
	   Utility.readExcelFile();
	   //for screenshot we have to call method in main method getscreenShot()
	   Utility.getscreenShot(driver, "google");   
	}

}
