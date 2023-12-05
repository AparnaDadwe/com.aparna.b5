package Testngpackage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		
		driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void verifyTitle() {
		//Actual means when we launch browser and we get something
		//expected is given in our requirement specification
		String expectedTitle="omayo (QAFox.com)";
		
		String actualTitle=driver.getTitle();
		
		System.out.println(actualTitle);
		
		//assertEquals assertion
		assertEquals(actualTitle,expectedTitle);//agar actualTitle and expectedTitle same hoge to
		                                        //hamara test case pass hoga to assertEquals use karo
		//assertNotEquals assertion(used for negative verification)
assertNotEquals(actualTitle,expectedTitle);//agar hamara actualTitltle and expectedTitle
		                                        //not equal hoga to hamara test case pass hoga
		                                        // agar equal hoga to fail hoga in assertNotEquals main
		
//	   //assertTrue   
//	WebElement checkButtonEnabled=driver.findElement(By.xpath("assertTrue(checkButtonEnabled.isEnabled());"));//here we check
//		                                            //button is enable or not if enable then our test ca
//		                                            //case will be passed otherwised failed
//		assertTrue(checkButtonEnabled.isDisplayed());
//		System.out.println(checkButtonEnabled.isDisplayed());
//		assertTrue(checkButtonEnabled.isEnabled());
//		System.out.println(checkButtonEnabled.isEnabled());
WebElement checkButtonEnabled3=driver.findElement(By.xpath("//button[@id='myBtn']"));
assertTrue(checkButtonEnabled3.isEnabled());
	}
	@Test
public void buttonStatusOnHomePage() {
		
		
WebElement checkButtonEnabled=driver.findElement(By.xpath("//button[@id='but2']"));
checkButtonEnabled.isEnabled();
assertTrue(checkButtonEnabled.isEnabled());
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
