package aparnaPackage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	
	public static void main(String args[]) {
		NameLocator loc=new NameLocator();
		loc.luanchbrowser();
	}
	
	public void luanchbrowser() {
		

		WebDriver driver=new ChromeDriver();
		

		driver.get("http://omayo.blogspot.com/");
		
		WebElement nameElement=driver.findElement(By.id("ta1"));
		
		nameElement.sendKeys("Mobile");
		
//		WebElement pageLinkText=driver.findElement(By.linkText("VIEW ALL"));
//		pageLinkText.click();
	}
	
	

}
