package aparnaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTestCase {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
	WebElement fileUploadButton=	driver.findElement(By.xpath("//input[@id='uploadfile']"));
	
	//Ethe aplyayla absolute path send karava lagto file upload karta na (Relative path nahi)
	fileUploadButton.sendKeys("D:\\Eclipse Workspace\\com.aparna.b5\\src\\test\\resources\\registerData.xls"); 
	}

}
