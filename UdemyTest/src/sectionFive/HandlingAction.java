package sectionFive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		Actions act = new Actions(driver);
		WebElement a = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement b =driver.findElement(By.xpath("//span[@class='nav-line-2']"));
		act.moveToElement(a).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		act.moveToElement(b).contextClick().build().perform();

	}

}
