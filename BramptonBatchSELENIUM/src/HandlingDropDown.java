import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//select[@id ='month']")).sendKeys("aug");;
		//Select class
		Select select = new Select(driver.findElement(By.xpath("//select[@id ='month']")));
		select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByValue("1");
		List<WebElement> s = select.getOptions();
		System.out.println(s.size());
		for (int i = 0; i < s.size() ;i++) {
			String txt = s.get(i).getText();
			System.out.println(txt);
		}
		
		
		
		
	
	}

}
