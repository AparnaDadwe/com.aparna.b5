package Testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UseOFGroupTestCase {

	WebDriver driver;
	SoftAssert  softAssert;//softAssert ko use karne ke liye uska 
	                                         //object banan padta hai SoftAssert ke class ka
	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		
		driver=	new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		 softAssert= new SoftAssert();		
	}
	@Test(enabled = true,groups = {"sanity"}, priority = 0)
	public void verifyTitle() {
		//assertEquals
		
		String expectedTitle="omayo (QAFox.com)";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		softAssert.assertEquals(actualTitle, expectedTitle);

	//assertNotEquals
	   softAssert.assertNotEquals("facebook123",actualTitle);
	   WebElement checkButtonEnabled=driver.findElement(By.cssSelector("button#but2"));
		System.out.println("Assertion is failed");
		softAssert.assertTrue(checkButtonEnabled.isEnabled());
	   WebElement checkButtonDisabled=driver.findElement(By.cssSelector("button#but1"));
		System.out.println(checkButtonDisabled.isEnabled());
		softAssert.assertFalse(checkButtonDisabled.isEnabled());
	    softAssert.assertAll();//softassert jab bhi use karte hai tab at the end assertAll() yeh
//		                      //method call karo 
	}
	@Test(enabled=true,groups = {"smoke"}, priority = 5)
	public void testUrl2() {
		softAssert.assertEquals(driver.getCurrentUrl(), "http://omayo.blogspot.com/");
		 softAssert.assertAll();
	}
	@Test(enabled = true,groups = {"e2e"}, priority = -5)
	public void testUrl() {
		softAssert.assertEquals(driver.getCurrentUrl(), "http://omayo.blogspot.com/");
		 softAssert.assertAll();
	}
	
	@Test(enabled = true,groups = {"sanity", "smoke"}, priority = 100)
	public void testUrl3() {
		softAssert.assertEquals(driver.getCurrentUrl(), "http://omayo.blogspot.com/");
		 softAssert.assertAll();
	}
	

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		
		driver.quit();
	}
}
