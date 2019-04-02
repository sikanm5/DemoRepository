import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		//command+f
		List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
		//System.out.println(iframe.size());
		driver.switchTo().frame(iframe.size()-1);
		String dragTxt = driver.findElement(By.id("draggable")).getText();
		System.out.println(dragTxt);
		driver.switchTo().defaultContent();
		Actions action = new Actions(driver);
		//action.dragAndDrop(x, y).build.control
		
	}

}
