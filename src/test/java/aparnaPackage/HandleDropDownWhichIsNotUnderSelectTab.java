package aparnaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropDownWhichIsNotUnderSelectTab  {
	
	 static WebDriver driver=new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		
		
		driver.get("https://www.airvistara.com/");
		
		driver.manage().window().maximize();//this will maximize google chrome window
		
		HandleDropDownWhichIsNotUnderSelectTab ha=new HandleDropDownWhichIsNotUnderSelectTab();
		ha.selectCountry("nepal");
    
	}

	public void selectCountry(String countryName) throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@id='select-country-dropdown']")).click();
		Thread.sleep(1000);
		List<WebElement>countries=driver.findElements(By.xpath("//div[@id='modal-list-country']//ul//li//span"));
		
		for(WebElement country:countries) {
			
			if(country.getText().equalsIgnoreCase(countryName)) {
				
				country.click();
			}
		}
		
	}

}
//selectCountry(String countryName) nam ka ek method banaya woh method  string ke format main
//countryName lega isi method main ham pahile dropdown pain click karege
//fir //div[@id='modal-list-country']//ul//li//span") this is locator to get all contries
//fir for loop main countries ka list pass karenge for(WebElement country:countries)
//countries yeh ek ek country ka webelemnt return karega 
//phir if condition main agar county.getText.equalIgnoreCase(countryName) hai to voh
//country pain click karega
//equalIgnoreCase () yane capital letter bhejo ya small letter bhejo 
//countryName yeh hamne method main pass kiya hua variable hain
//