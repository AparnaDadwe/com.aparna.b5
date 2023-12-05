package allWebDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@id='field1']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='field1']")).sendKeys("Operation of Doublee click");

	WebElement doubleClickBtn=	driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
	    Actions act=new Actions(driver);
	    Thread.sleep(2000);
	    act.doubleClick(doubleClickBtn).perform();//performs the double click action

	}

}
