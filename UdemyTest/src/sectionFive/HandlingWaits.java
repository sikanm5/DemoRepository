package sectionFive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWaits {

	public static void main(String[] args) {
	
		//Implicit wait:
		//It will instruct the webdriver
		//Wait for n number of seconds before throw error no such an element exception
		//Loading senario
		//It use for entire session
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Explicit wait:
		//Explicit waits can be set for specific elements
		//Can be set for specific condition
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOf(webelement))
		WebDriverWait wait = new WebDriverWait(driver, 20);

		
		
		
	
	
	
	}

}
