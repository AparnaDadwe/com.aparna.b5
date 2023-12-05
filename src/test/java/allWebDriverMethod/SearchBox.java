package allWebDriverMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBox {
	 WebDriver driver;
	 WebDriverWait wait;
     @BeforeMethod
    public void setUp() {
 	   driver=new ChromeDriver();
 	   driver.get("https://www.target.com/");
 	   driver.manage().window().maximize();
 	     
    }
    @Test 
    public void verify_searchBox() {
    	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Baby diaper");
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2000));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='styles__SearchTypeaheadContent-sc-1h8k6rt-0 dvjjBm']")));
    	WebElement list=driver.findElement(By.xpath("//div[@class='styles__SearchTypeaheadContent-sc-1h8k6rt-0 dvjjBm']"));
    	List <WebElement>rows=list.findElements(By.xpath("//ul[@id='typeahead']"));
    	for(WebElement elem:rows) {
    	System.out.println(elem.getText());
    	}

    }
}
