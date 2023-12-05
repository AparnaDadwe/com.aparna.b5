package allWebDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysGetValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.target.com/");
	   WebElement searchBox=	   driver.findElement(By.xpath("//input[@id='search']"));
	   searchBox.sendKeys("Mobile");
   searchBox.getAttribute("value");
	   System.out.println(searchBox.getAttribute("value"));

	}

}
