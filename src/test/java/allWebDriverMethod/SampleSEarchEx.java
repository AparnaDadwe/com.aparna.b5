package allWebDriverMethod;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleSEarchEx {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		//open google
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//enter techlistic tutorials in search box
		driver.findElement(By.name("q")).sendKeys("selenium tutorial techlistic");

		//wait for suggestions
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2000));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sbtc")));

		WebElement list=driver.findElement(By.className("sbtc"));
		List<WebElement> lists=list.findElements(By.tagName("li"));

		for(WebElement elem:lists) {
		System.out.println(elem.getText());
		}

	}

}
