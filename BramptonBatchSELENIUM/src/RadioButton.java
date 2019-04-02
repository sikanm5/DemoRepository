import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;

	import org.openqa.selenium.firefox.FirefoxDriver;


public class RadioButton {

	public static void main(String[] args) {

	// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
	//driver.findElement(By.xpath("//input[@value='Milk']")).click();

	int count =driver.findElements(By.xpath("//input[@name='group1']")).size();

	for(int i=0;i<count;i++)

	{

	//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

	String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");

	if(text.equals("Cheese"))

	{

	driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

	}

	}

	}

	}