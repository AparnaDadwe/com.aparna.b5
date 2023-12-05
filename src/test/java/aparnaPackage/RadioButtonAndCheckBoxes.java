package aparnaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAndCheckBoxes {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();	
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//radio button pain click karna hai
		
	driver.findElement(By.xpath("//input[@id='radio2']")).click();
	
	driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		
    driver.findElement(By.xpath("//input[@id='radio1']")).click();
	
	driver.findElement(By.xpath("//input[@id='checkbox2']")).click();

	}

}
