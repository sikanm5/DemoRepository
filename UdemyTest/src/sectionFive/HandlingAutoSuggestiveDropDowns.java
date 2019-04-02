package sectionFive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestiveDropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		WebElement select = driver.findElement(By.xpath("//input[@id ='fromCity']"));
		select.click();
		//select.clear();
		select.sendKeys("de");
		select.sendKeys(Keys.ENTER);
		WebElement selectTwo = driver.findElement(By.xpath("//input[@id ='toCity']"));
		selectTwo.click();
		//selectTwo.clear();
		selectTwo.sendKeys("v");
		selectTwo.sendKeys(Keys.ARROW_DOWN);
		selectTwo.sendKeys(Keys.ENTER);
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
