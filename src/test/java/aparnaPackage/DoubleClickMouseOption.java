package aparnaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickMouseOption {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
	WebElement doubleClickBtn=	driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
		Actions act=new Actions(driver);
		act.doubleClick(doubleClickBtn).perform();
		
		driver.switchTo().alert().accept();
		
	}

}
