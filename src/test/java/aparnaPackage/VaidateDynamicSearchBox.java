package aparnaPackage;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VaidateDynamicSearchBox {

	public static void main(String[] args) {
		
		
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("pedigree");
		ar.add("royal canin");
		ar.add("cat food");
		ar.add("henlo");
		ar.add("dog food");
		ar.add("litter");
		ar.add("drools");
		ar.add("whiskas");
		ar.add("farmina");
		
	
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://supertails.com/");
		driver.manage().window().maximize();
	
		By products=By.xpath("//input[contains(@placeholder,'Search for')]");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		for(int i=0;i<9;i++) 
		{
			System.out.println("Search for" + ar.get(i));
			wait.until(ExpectedConditions.attributeToBe(products, "placeholder", "Search for\" + ar.get(i)"));			
		}
		

	}

}
