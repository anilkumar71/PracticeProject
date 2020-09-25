package USTProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchExample {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","D:\\Seleniumfile\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		String winHandleBefore = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(winHandleBefore);
		
		//Switch Tab Example
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='opentab']")).click();

	}

}
