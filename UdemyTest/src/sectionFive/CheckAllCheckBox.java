package sectionFive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAllCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.tripcentral.ca/cheap-flights/");
		List<WebElement> countCheckBox = driver.findElements(By.xpath("//input[@type ='checkbox']"));
		//int count = countCheckBox.size();
		for(WebElement el : countCheckBox ) {
			if(!el.isSelected()) {
				el.click();
			}
		}
		
			}
			

}
