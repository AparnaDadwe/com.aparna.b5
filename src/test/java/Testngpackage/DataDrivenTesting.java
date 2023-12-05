package Testngpackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataDrivenTesting {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
	}
	@Test(dataProvider = "data")
	            //test case for multiple user can login with same test case
	public void verifyValidLogin(String userName, String passWord) {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userName);
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passWord);
		   driver.findElement(By.xpath("//input[@name='submit']")).click();
		   
		   assertEquals(driver.findElement(By.xpath("//h3")).getText(), "Login Successfully");
	}
	@DataProvider(name="data")   //@DataProvider is annotation for our data and pass here name =data
	                      
	public String[][] dataprovider() {
		//String type ka array and we pass here our data
		String[][] array= {{"admin","admin"}, {"admin1","password"},{"admin2","password2"}};
		return array;
	}
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}

}
