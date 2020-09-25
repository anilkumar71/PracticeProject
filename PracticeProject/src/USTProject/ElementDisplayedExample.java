package USTProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayedExample {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Seleniumfile\\chromedriver_win32 (1)\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@name='show-hide']")).click();
			
			driver.findElement(By.name("show-hide")).sendKeys("Hello World");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
			
			Thread.sleep(2000);
			driver.close();

	}

}
