package USTProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionClass {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","D:\\Seleniumfile\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		
		List<WebElement> suggestion = driver.findElements(By.xpath("//input[@id='autocomplete']"));
		driver.findElement(By.id("autocomplete")).sendKeys("India");
		
		for(WebElement suggest : suggestion)
		{
			//Thread.sleep(2000);
			if(suggest.getText().equalsIgnoreCase("India")) {
				suggest.click();
				break;
			}
		}
			driver.close();
	}

}
