package Testngpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CarousalImageHandling {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void varify_CarousalImageHandling() {
       List<WebElement> imageList=driver.findElements(By.xpath("//div[@class='children']"));
       
	}
	

}
