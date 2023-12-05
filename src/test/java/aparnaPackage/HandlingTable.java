package aparnaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			
			driver.get("http://omayo.blogspot.com/");
			
			driver.manage().window().maximize();
			//PPrint all table Data
List<WebElement>	allTableData=		driver.findElements(By.xpath("//table[@id='table1']/tbody//tr//td"));
       for(WebElement elm:allTableData) {
    	   
    	   System.out.print(" "+elm.getText());
       }
       System.out.println(" ");
       System.out.println("@@@@@@@@@@@@Print the element of first row@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
       
     List<WebElement> firstRowData= driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[1]/td"));
       
     for(WebElement frelm:firstRowData) {
  	   
  	   System.out.print(" "+frelm.getText());
     }
     //suppose i want name only deepti from 4th row
  WebElement singleNameFromrow=driver.findElement(By.xpath("//table[@id='table1']/tbody//tr[4]//td[1]"));
  singleNameFromrow.getText();
     
	
	}

}
