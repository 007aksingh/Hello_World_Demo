package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/");
		driver.findElement(By.xpath("//div[@class=\"StaticLoggedOutHomePage-buttons\"]/a[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='js-username-field email-input js-initial-focus']")).sendKeys("8095064244");
		driver.findElement(By.xpath("//input[@class='js-password-field']")).sendKeys("test1234");
		driver.findElement(By.xpath("//button[text()='Log in']")).submit();
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.xpath("//input[@class='search-input']"));
		
		search.sendKeys("Potus");
		Thread.sleep(3000);
		driver.findElement(By.id("tweet-box-home-timeline")).click();
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.moveToElement(search).click().perform();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("(//div[@role='presentation']//li)[1]"));
		Thread.sleep(1000);
		action.moveToElement(ele).click().perform();
		System.out.println("done");
		
		
	

	}

}
