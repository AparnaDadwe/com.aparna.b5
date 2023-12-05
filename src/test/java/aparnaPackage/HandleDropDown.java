package aparnaPackage;
//dropdown under select tab it is single selection dropdown
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
	       WebDriver driver=new ChromeDriver();
			
			driver.get("http://omayo.blogspot.com/");
			
			driver.manage().window().maximize();//this will maximize google chrome window
			//locator of select tag
			WebElement singleSelectionDropDown= driver.findElement(By.xpath("//select[@id='drop1']"));
			
			Select select=new Select(singleSelectionDropDown);//this is object of select class
			// here we have to pass locator of select class
			
		List<WebElement> dropdownOption=	select.getOptions();
		//getOptions() print all dropdown list
		for(WebElement option:dropdownOption) {
			
			System.out.println(option.getText());
			//getText() give the text of dropdown	
		}
		
		//to get single element from a list just get index and getText
		
		System.out.println("Single Option "+dropdownOption.get(0).getText());
		
		System.out.println(select.isMultiple());//isMultiple() shows if u r dropdown selection is multiple
		                    //it returns false and single selection is true
		
		
		select.selectByIndex(4);//here we pass the index of dropdown element 4 index of doc4 and in 
		                        //it will select doc4 on webpage 
		
      	select.selectByValue("ghi");//here we pass the value of dropdown element that given in
      	                           //webpage and it will print in webpage 
	
	select.selectByVisibleText("Older Newsletters");
		
		

	}

}
