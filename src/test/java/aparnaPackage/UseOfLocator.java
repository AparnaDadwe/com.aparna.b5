package aparnaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//driver.findElement return WebElement

public class UseOfLocator {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		// By id locator
		WebElement idLink= driver.findElement(By.id("link1"));
//		idLink.click();
		
		// by name locator
		WebElement	userIdTextBox=driver.findElement(By.name("userid"));
//		userIdTextBox.sendKeys("Aparna Dadwe");
		
//		//by linktext locator used only for anchor tag
//		WebElement pageLinkText=driver.findElement(By.linkText("Page One"));
//		pageLinkText.click();
		
		// by partiallinktext use counter/ partial part of link (ex: page one so take only pag)
		
//		driver.findElement(By.partialLinkText("Pag")).click(); //here we call the click method 
		//(/page-one.html)
		
		//by Tag Name  locator
		
		System.out.println(driver.findElement(By.tagName("a")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
