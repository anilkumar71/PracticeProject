package USTProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Seleniumfile\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		
        Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='radio3']")).click();
		
		driver.close();

	}

}
