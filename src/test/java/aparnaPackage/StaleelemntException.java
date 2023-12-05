package aparnaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleelemntException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a//span[text()='Log In']")).click();
		WebElement textUsername=driver.findElement(By.xpath("//input[@name='email']"));
		textUsername.sendKeys("Aparna");
		WebElement textPassword=driver.findElement(By.xpath("//input[@name='password']"));
		textPassword.sendKeys("Aparna@1234");
		
		driver.navigate().refresh();
		
		//catching exception in that line so keep this line in try block
		try {
		textUsername.sendKeys("Aparna");
		}
		catch(StaleElementReferenceException e){
			textUsername=driver.findElement(By.xpath("//input[@name='email']"));
			textUsername.sendKeys("Aparna");
		}

	}

}
