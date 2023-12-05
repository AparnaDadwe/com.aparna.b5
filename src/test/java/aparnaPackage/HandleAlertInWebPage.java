package aparnaPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//In alert we can get text , we sendkeys in text box and accept means positive and dismiss means negative
//response

public class HandleAlertInWebPage {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
			
			driver.get("http://omayo.blogspot.com/");
			
			driver.manage().window().maximize();//this will maximize google chrome window
			
			driver.findElement(By.xpath("//input[@id='prompt']")).click();
			
			Alert alert=driver.switchTo().alert();
			
		System.out.println(	alert.getText());
		
		Thread.sleep(5000);
		
		alert.sendKeys("This is java script alert");
			
//		alert.accept(); // accept means positive action
             alert.dismiss(); // dismiss means negative action 

	}

}
