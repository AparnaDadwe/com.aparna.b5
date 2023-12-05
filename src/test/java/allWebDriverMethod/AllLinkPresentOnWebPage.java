package allWebDriverMethod;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkPresentOnWebPage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        
//    List<WebElement>  linkList= driver.findElements(By.xpath("//a"));
    List<WebElement>  linkList= driver.findElements(By.tagName("a"));
    System.out.println("The size of Link :"+linkList.size());
//    for(WebElement li:linkList) {
//    	System.out.println(li.getText()+ "  "+ li.getAttribute("href"));
//    }
    
    //iterator method
 Iterator<WebElement> allLinkList=  linkList.iterator();
 while(allLinkList.hasNext()) {
	 WebElement elm=allLinkList.next();
	 System.out.println(elm.getText()+" "+elm.getAttribute("href"));
 }
	}

}
