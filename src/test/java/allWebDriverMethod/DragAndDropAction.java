package allWebDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//locator of sorce element that we have to drag
	WebElement sourceElemnt=	driver.findElement(By.xpath("//div[@id='draggable']"));
	
	//locator of target elemnt in which we drop our source element
	
	WebElement targetElemnt=	driver.findElement(By.xpath("//div[@id='droppable']"));
	
	//object of action class
	
	Actions act =new Actions(driver);
	act.dragAndDrop(sourceElemnt, targetElemnt).perform();//rag and drop operation

	}

}
