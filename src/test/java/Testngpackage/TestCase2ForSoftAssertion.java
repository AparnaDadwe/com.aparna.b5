package Testngpackage;

//Sofr Assertion or verification main agar kohi assertion fail hua to bhi further code execute hota hai
//aur age ke assertion execute hote aur fail hote hai par bat main batata hai kitne assertion fail 
//huye hai pass huye hai
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2ForSoftAssertion {
	
	WebDriver driver;
	SoftAssert  softAssert;//softAssert ko use karne ke liye uska 
	                                         //object banan padta hai SoftAssert ke class ka
	@BeforeMethod
	public void setUp() {
		
		driver=	new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		 softAssert= new SoftAssert();		
	}
	@Test
	public void verifyTitle() {
		//assertEquals
		
		String expectedTitle="omayo (QAFox.com)";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
//		softAssert.assertEquals(actualTitle, expectedTitle);
//	softAssert.assertTrue(actualTitle.equals(expectedTitle));//here we use equal method to check actualTitle
	                                             //and expectedTitle
		
	//assertNotEquals
		softAssert.assertNotEquals(actualTitle,expectedTitle);
		
//		//assertTrue(assertTrue ke andar agar condition true rahti hai tab test case pass hota hai)
		WebElement checkButtonEnabled=driver.findElement(By.xpath("//button[@id='but2']"));
		System.out.println(checkButtonEnabled.isEnabled());
		softAssert.assertTrue(checkButtonEnabled.isEnabled());
	
//		//asserFalse(assertFalse ke andar jab false condition rahti hai tab test case pass hota hai)
		WebElement checkButtonDisabled=driver.findElement(By.xpath("//button[@id='but1']"));
		System.out.println(checkButtonDisabled.isEnabled());
		softAssert.assertFalse(checkButtonDisabled.isEnabled());
		
	softAssert.assertAll();//softassert jab bhi use karte hai tab at the end assertAll() yeh
//		                      //method call karo 
//		
//		
		
	}
	
	@Test
	public void testUrl() {
		softAssert.assertEquals(driver.getCurrentUrl(), "http://omayo.blogspot.com/");
		softAssert.assertAll();
		
	}
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}


}
