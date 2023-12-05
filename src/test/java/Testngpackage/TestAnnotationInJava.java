package Testngpackage;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestAnnotationInJava {
	@BeforeSuite
	public void beforeSuitMethod() {
		System.out.println("Before Suit");
	}
@AfterSuite
public void afterSuitMethod() {
	System.out.println("Before Suit");
}
}
