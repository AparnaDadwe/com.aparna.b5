package aparnaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemainingWebElementCommand {

	public static void main(String[] args) throws InterruptedException {
		     WebDriver driver=new ChromeDriver();	
			driver.get("http://omayo.blogspot.com/");
			driver.manage().window().maximize();
			// yaha pain pahile scrolling karna hai scroll karne ke bad sendkeys karna hai serch box main
			//5 sec bad search box se text clear karna hai
			//yaha hum scrolling ka concept use karenge
			
			
			WebElement searchText=driver.findElement(By.xpath("//input[@title='search' and @name]"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);",searchText);
			
			searchText.sendKeys("Te testing is easy");
			
			Thread.sleep(5000);
			searchText.clear();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='radio2']")).click();
			
			driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
			
			Thread.sleep(5000);
				
		    driver.findElement(By.xpath("//input[@id='radio1']")).click();
			
			driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
			
	}

}
