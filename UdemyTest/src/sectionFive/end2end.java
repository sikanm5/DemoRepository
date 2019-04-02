package sectionFive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class end2end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.tripcentral.ca/cheap-flights/");
	WebElement departingFrom = driver.findElement(By.xpath("//input[@id ='round-trip-departure1']"));
	departingFrom.clear();
	departingFrom.sendKeys("toronto");
	departingFrom.sendKeys(Keys.ARROW_DOWN);
	departingFrom.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//input[@id ='round-trip-date1']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'15')]")).click();
	Select selectDepart = new Select(driver.findElement(By.xpath("//select[@id ='timeType1']")));
	selectDepart.selectByIndex(0);
	WebElement roundTrip = driver.findElement(By.xpath("//input[@id ='round-trip-departure2']"));
	roundTrip.sendKeys("Germany");
	roundTrip.sendKeys(Keys.ARROW_DOWN);
	roundTrip.sendKeys(Keys.ENTER);
	//driver.findElement(By.xpath("//input[@id ='round-trip-date2']")).click();
	//driver.findElement(By.xpath("//a[contains(text(),'27')]")).click();
	Select selectDepartTwo = new Select(driver.findElement(By.xpath("//select[@id ='timeType2']")));
	selectDepartTwo.selectByIndex(1);
	List<WebElement> countSelectDepart = selectDepartTwo.getOptions();
	for(int i =0;i<countSelectDepart.size();i++) {
		String valDropDown = countSelectDepart.get(i).getText();
		System.out.println(valDropDown);
	}
	System.out.println(countSelectDepart.size());
	driver.findElements(By.xpath("//input[@type='checkbox']"));
	List<WebElement> count = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement el : count) {
		if(!el.isSelected()) {
			el.click();
		}
	}
	
	
	
	
	
	

	}

}
