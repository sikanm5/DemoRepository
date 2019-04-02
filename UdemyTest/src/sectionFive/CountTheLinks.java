package sectionFive;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountTheLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tripcentral.ca/cheap-flights/");
		List<WebElement> countLink = driver.findElements(By.tagName("a"));
		System.out.println(countLink.size());
		//for(int i =0;i<countLink.size();i++) {
			//String textLinks = countLink.get(i).getText();
			//System.out.println(textLinks);
		//}
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Count links only on footer section
		//Create mini driver for footer section
		//full-width-widgit-container text-block 
		WebElement footer = driver.findElement(By.xpath("//div[@class ='links']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		List<WebElement> c = footer.findElements(By.tagName("a"));
		System.out.println(c.size());
		for(int i=0;i<c.size();i++) {
		String clickOnTab =	Keys.chord(Keys.COMMAND,Keys.ENTER);
			c.get(i).sendKeys(clickOnTab);
		}
		Set<String>	abc = driver.getWindowHandles();
	Iterator<String> it =	abc.iterator();
	while (it.hasNext()) {
		
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
		
	}
	
			
			
			
			
		}
		
		
	

}
