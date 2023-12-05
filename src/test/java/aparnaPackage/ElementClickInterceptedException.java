package aparnaPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClickInterceptedException {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
			
			driver.get("http://omayo.blogspot.com/");
			
			driver.manage().window().maximize();
			
			WebElement  bogclick=driver.findElement(By.xpath("//span[@id='blogsmenu']"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);",bogclick);
			Thread.sleep(5000);
			bogclick.click();
			Thread.sleep(5000);
			WebElement link=driver.findElement(By.xpath("//a[@id='selenium143']"));
			js.executeScript("arguments[0].click();", link);
			
	}

}
