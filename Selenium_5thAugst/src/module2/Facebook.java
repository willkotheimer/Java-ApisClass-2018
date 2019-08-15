package module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		//open browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selenium 3.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//Open AUT
		
		driver.get("https://www.facebook.com");
		/*
		//ID -- username
		driver.findElement(By.id("u_0_e")).sendKeys("Will");
		
		//Name
		driver.findElement(By.name("lastname")).sendKeys("Kotheimer");
		
		//ClassName -- not unique enough to make a sendKeys method
		driver.findElement(By.className("inputtext")).sendKeys("Say something");
		
		//Linktext
		*/
		//driver.findElement(By.linkText("Forgot Account?")).click();
		
		//Partial Linktest
		driver.findElement(By.partialLinkText("Forgot")).click();
		//previous
		driver.navigate().back();
		
		//Tagname
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		
		//CSS
		driver.findElement(By.cssSelector("#u_0_7"));
		
	
	}
}
