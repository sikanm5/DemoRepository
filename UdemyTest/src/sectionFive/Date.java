package sectionFive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		

		while(!driver.findElement(By.xpath("//span[@class ='ui-datepicker-month']")).getText().contains("April")) {
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		}
		
		List<WebElement> date = driver.findElements(By.xpath("//a[@class ='ui-state-default']"));
		for(int i =0;i<date.size();i++) {
			String dateClaender = date.get(i).getText();
		if(dateClaender.equalsIgnoreCase("23")) {
			date.get(i).click();
			break;
		
		}
		
		}
	
	}

}
