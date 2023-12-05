package allWebDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.id("a077aa5e"));
		driver.switchTo().frame(frame);

		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
	}

}
