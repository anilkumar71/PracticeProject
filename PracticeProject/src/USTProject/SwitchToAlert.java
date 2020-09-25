package USTProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {

	public static void main(String[] args) throws InterruptedException {
     
       System.setProperty("webdriver.chrome.driver","D:\\Seleniumfile\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='enter-name']")).click();
		driver.findElement(By.name("enter-name")).sendKeys("Anil Kumar");
		
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		Alert alert = driver.switchTo().alert();
		String print=alert.getText();
		System.out.println(print);
		Thread.sleep(2000);
		alert.accept();
		
		
		driver.findElement(By.xpath("//input[@name='enter-name']")).click();
		driver.findElement(By.name("enter-name")).sendKeys("Anil Kumar");
		
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		
		Alert alert1 = driver.switchTo().alert();
		String print1=alert.getText();
		System.out.println(print);
		Thread.sleep(2000);
		alert.accept();
		//alert.dismiss();
		
		driver.close();

	}

}
