package Testngpackage;
//Hard Assertion Example/Annotation
//In hard assertion if any code is failed then further code will not execute
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCaseVerifyTitle {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		
		driver=	new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void verifyTitle() {
		//assertEquals
		
		String expectedTitle="omayo (QAFox.com)";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
	assertEquals(actualTitle, expectedTitle);
	assertTrue(actualTitle.equals(expectedTitle));//here we use equal method to check actualTitle
	                                             //and expectedTitle
		
	//assertNotEquals
//		assertNotEquals(actualTitle,expectedTitle);
		
		//assertTrue(assertTrue ke andar agar condition true rahti hai tab test case pass hota hai)
		WebElement checkButtonEnabled=driver.findElement(By.cssSelector("button#but2"));
		System.out.println(checkButtonEnabled.isEnabled());
//		assertFalse(checkButtonEnabled.isDisplayed());
//		System.out.println("AssertionFailed");
		assertTrue(checkButtonEnabled.isEnabled());
		
		//asserFalse(assertFalse ke andar jab false condition rahti hai tab test case pass hota hai)
		WebElement checkButtonDisabled=driver.findElement(By.cssSelector("button#but1"));
//		System.out.println(checkButtonDisabled.isEnabled());
//		assertFalse(checkButtonDisabled.isEnabled());
		assertTrue(checkButtonDisabled.isEnabled());
		
		}
	
	@Test
	public void testUrl() {
		assertEquals(driver.getCurrentUrl(), "http://omayo.blogspot.com/");
	
		
	}
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
