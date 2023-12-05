package aparnaPackage;
//multiple dropdown selection
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultipleSection {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();//this will maximize google chrome window
		//locator of select tag
		WebElement multipleSelectionDropDown= driver.findElement(By.xpath("//select[@id='multiselect1']"));
		//select class ka locator pass karna padega
		Select select=new Select(multipleSelectionDropDown);//this is object of select class
		
		//getOption() method print list dropdown
	List<WebElement> multipleOptions=select.getOptions();
	
	for(WebElement options:multipleOptions) {
		
		System.out.println(options.getText());
	}
		
		System.out.println(select.isMultiple());
		
		select.selectByIndex(3);//here we pass the index 3 is of audi so it will select audi in webpage
		
	select.selectByValue("swiftx");//here we pass the value that given in webpage swiftx is the 
	                               //value of swift so it will select swift in dropdown  
     
	select.selectByVisibleText("Volvo");
	
	//deselectAll() ke sare method sirf multiple selection dropdown wale pain chalte hai
		
//		select.deselectAll();//deselectAll() yeh method sare selected elemnt deselect karta hai
	
     	select.deselectByIndex(0);//we pass index  3 which index of audi so it will deselct audi
 
		select.deselectByValue("audix");//here we pass the value of audi so it will deselect audi
		
		select.deselectByVisibleText("Swift");
		
		//aagin we have to select option for getAllSelectedOptions
         //getAllSelectedOptions() ke liye hame phir se selcted karna hota hai
		select.selectByIndex(0);
		select.selectByValue("audix");
		System.out.print("****************************************************");
		 List<WebElement> allSelctedOption= select.getAllSelectedOptions();
		 
		Iterator<WebElement> itr= allSelctedOption.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next().getText());
		}
	
	}

}
