package USTProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Seleniumfile\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.name("iframe-name")));
		
		driver.findElement(By.xpath("//a[contains(text(),'Practice Projects')]")).click();
		
		driver.findElement(By.name("name")).sendKeys("Anil Kumar");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//button[@id='form-submit']")).click();
		
		Thread.sleep(5000);
		driver.close();

	}

}
