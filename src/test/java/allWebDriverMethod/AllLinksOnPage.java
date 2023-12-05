package allWebDriverMethod;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksOnPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		  driver.get("http://omayo.blogspot.com/");
		  driver.manage().window().maximize();
		 //in web page all link in always in anchor tag
		  //get all link 
		  
		  List<WebElement> allLink= driver.findElements(By.xpath("//a"));
		 //using advance for loop
//		  for(WebElement listOfLink:allLink) {
//			  System.out.println(listOfLink.getText()+ " - " + listOfLink.getAttribute("href"));
//		  }
		  
		  //using iterator
		  
		Iterator<WebElement> itrList = allLink.iterator();
		
		while(itrList.hasNext()) {
		  WebElement elm=itrList.next();
	
		System.out.println(elm.getText()+" - "+elm.getAttribute("href"));
		}
	}

}
