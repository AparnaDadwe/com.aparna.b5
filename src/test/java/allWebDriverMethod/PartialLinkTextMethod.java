package allWebDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		  driver.get("http://omayo.blogspot.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.partialLinkText("Pag")).click();
	}

}
