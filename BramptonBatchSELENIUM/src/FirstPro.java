import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.get("http://www.facebook.com");
		driver.navigate().back();
	    driver.manage().window().maximize();
	    System.out.println(driver.getCurrentUrl());
		String appTitle = driver.getTitle();
		if (appTitle.equalsIgnoreCase("google") ) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");

		}
		String pageSource = driver.getPageSource();
		System.out.println("The page source is:" +pageSource);
		
		driver.close();
		
		
	}

}
