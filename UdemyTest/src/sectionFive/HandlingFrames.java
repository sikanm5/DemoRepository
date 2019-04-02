package sectionFive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	public static void main(String[] args) {
		//Frames are a part of web page or browser window which
		//displays content independent of its container
		//Control+f(iframe)
		//You can switch to the frame by index,String or web element
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//div[@id ='draggable']")).click();
		Actions a = new Actions(driver);
		
		//a.dragAndDrop(source, target);
		driver.switchTo().defaultContent();
	}

}
