package sectionFive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class HandlingAssertion {

	public static void main(String[] args) {
		// Assertion is helping the validate the results that if selenium return is false or true
		//valueRadio
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tripcentral.ca/cheap-flights/");
		WebElement radio = driver.findElement(By.xpath("//input[@id ='valueRadio']"));
		Assert.assertFalse(radio.isSelected());
		
		//Assert equal is actually compare two arguments.
		//()1 the value that selenium return and second one is the value that is expected
		
	
	
	
	}

}
