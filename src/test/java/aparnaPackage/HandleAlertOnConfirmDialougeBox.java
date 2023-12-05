package aparnaPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertOnConfirmDialougeBox {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();//this will maximize google chrome window
		
		driver.findElement(By.xpath("//input[@id='confirm']")).click();
		
		 Alert   alt= driver.switchTo().alert();
		 
		 alt.getText();
		 
		 System.out.println(alt.getText());
		 
		 alt.accept();//accept method means positive response
//		 alt.dismiss();
	}

}
