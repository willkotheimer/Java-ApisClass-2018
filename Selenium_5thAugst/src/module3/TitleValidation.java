package module3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TitleValidation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selenium 3.4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");
		
		//Capture the title of the page
		
		String Apptitle = driver.getTitle();
		System.out.println(Apptitle);
		
		//validate the actual title vs expected title
		
		boolean Result  = Apptitle.equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
		
		System.out.println(Result);
		
		driver.close();
	}
	
}
