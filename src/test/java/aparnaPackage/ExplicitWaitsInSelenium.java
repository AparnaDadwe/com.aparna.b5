package aparnaPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitsInSelenium {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		//for explicit wait we have to create object of webdriverWaits
		
		
       driver.findElement(By.xpath("//button[@onclick='setTimeout(myFunction,3000)']")).click();
		
       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2000) );
  WebElement  facebookOption=   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Facebook']")));
  facebookOption.click();

	}

}
