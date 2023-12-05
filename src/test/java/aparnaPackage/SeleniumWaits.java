package aparnaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWaits {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			
			driver.get("http://omayo.blogspot.com/");
			
			driver.manage().window().maximize();
			
		WebElement dropdown=	driver.findElement(By.xpath("//button[@class='dropbtn']"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",dropdown);
		dropdown.click();
			
			driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	}

}
