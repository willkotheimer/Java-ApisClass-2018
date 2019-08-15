package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJavaClass {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selenium 3.4\\chromedriver_win32.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//Get commands:
		driver.get("/");
		driver.getCurrentUrl();
		driver.getTitle();
		
		//Navigation commands
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().getClass();
		
		//Element Handling
		driver.findElement(By.id(id)).click();
		driver.findElement(By.id(id)).sendKeys("Abhresh"); //to type in field
		driver.findElement(By.id(id)).getText();
		driver.findElement(By.id(id)).clear(); //to erase data from website
		
		
		
		
		driver.close();
		
		
		
	}
}
