package allWebDriverMethod;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllLinkTargetHome {
        WebDriver driver;
        @BeforeMethod
       public void setUp() {
    	   driver=new ChromeDriver();
    	   driver.get("https://www.target.com/");
    	   driver.manage().window().maximize();
       }
        @Test
        public void verifyAllLink() {
        	 List<WebElement> allLink= driver.findElements(By.xpath("//a"));
        	 System.out.println("The size of Link :"+allLink.size());
        	 
        	 Iterator<WebElement> itrList = allLink.iterator();
     		
     		while(itrList.hasNext()) {
     		  WebElement elm=itrList.next();
     		System.out.println(elm.getText()+" - "+elm.getAttribute("href"));
     		}
     	
        }
}
