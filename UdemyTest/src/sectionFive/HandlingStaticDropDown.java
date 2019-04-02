package sectionFive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingStaticDropDown {
//following-sibling::li[1]
	//parent::ul
	public static void main(String[] args) throws InterruptedException {
		//If there is select it is static drop down
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Select s = new Select(driver.findElement(By.xpath("//selet[@id='ctl00_mainContent_DropDownListCurrency']")));
		List<WebElement> sizeSelect = s.getOptions();
		for(int i =0;i<sizeSelect.size();i++) {
			String options = sizeSelect.get(i).getText();
		System.out.println(options);
			
		}
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		for(int i= 0;i<5;i++) {
			
			driver.findElement(By.id("hrefIncAdt")).click();	
			
		}
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText();
	
		
	}
}
