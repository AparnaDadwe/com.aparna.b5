package allWebDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
	WebElement button=	driver.findElement(By.xpath
			("//span[@class='context-menu-one btn btn-neutral']"));
		
		//make object of Action class
		
		Actions act=new Actions(driver);
		
		
		//right click operation
		act.contextClick(button).perform();
	}

}
