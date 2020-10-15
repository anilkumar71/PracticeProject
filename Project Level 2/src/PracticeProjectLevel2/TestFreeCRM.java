package PracticeProjectLevel2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFreeCRM {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Seleniumfile\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://ui.freecrm.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("anilkmrgupta899@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Test@123");
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Contacts")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("New")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("first_name")).sendKeys("Anil");
		
		driver.findElement(By.name("last_name")).sendKeys("Kumar");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@name='company']//input[@class='search']")).sendKeys("UST Global");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@name='company']//i[@class='search icon']")).click();
		
		driver.findElement(By.xpath("//div[@class='ui right corner labeled input']//input[@name='value']")).sendKeys("test@gmail.com");
		
       driver.findElement(By.xpath("//div[@name='channel_type']//i[@class='dropdown icon']")).click();
       
       Thread.sleep(2000);
       
       
       
       //driver.findElement(By.xpath("//div[@class='visible menu transition']//div[@class='item']//span[@class='text']")).click();
       
		List<WebElement> elements =driver.findElements(By.xpath("//div[@class='visible menu transition']//div[@class='item']//span[@class='text']"));
		
           for(WebElement element : elements) {
			
			Thread.sleep(2000);
			if(element.getText().equals("Facebook")) {
				Thread.sleep(2000);
				element.click();
				break;

		}
           }
           
           driver.findElement(By.xpath("//div[@name='timezone']//input[@class='search']")).sendKeys("Asia/Kolkata");
   		
   		Thread.sleep(2000);
   		
   		driver.findElement(By.xpath("//div[@name='timezone']//i[@class='dropdown icon']")).click();
			Thread.sleep(2000);
		       
			driver.findElement(By.xpath("//div[@class='ui input']//input[@name='address']")).sendKeys("F-12,SrishtiAnmol Apartment");
			
			driver.findElement(By.xpath("//div[@class='ui input']//input[@name='city']")).sendKeys("Bangalore");
			
			driver.findElement(By.xpath("//div[@class='ui input']//input[@name='state']")).sendKeys("Karnataka");
			
			driver.findElement(By.xpath("//div[@class='ui input']//input[@name='zip']")).sendKeys("560097");
			
			driver.findElement(By.xpath("//div[@name='country']//input[@class='search']")).sendKeys("India");
			Thread.sleep(2000);
	   		
	   		driver.findElement(By.xpath("//div[@name='country']//i[@class='dropdown icon']")).click();
	   		
	   		
	   		//driver.findElement(By.xpath("//input[@name='do_not_call']/ancestor::div[@class='ui toggle checkbox']")).click();
	   		
	   		driver.findElement(By.xpath("//div[@class='ui toggle checkbox']//label[text()='Do not Call']")).click();
	   			
	   		driver.findElement(By.xpath("//input[@name='day']")).sendKeys("22");
	   		
	   		Thread.sleep(2000);
	   		
	   		driver.findElement(By.xpath("//div[@name='month']//i[@class='dropdown icon']")).click();
	   		
	   		List<WebElement> elements1 =driver.findElements(By.xpath("//span[text()='May']"));
			
	           for(WebElement element1 : elements1) {
				
				Thread.sleep(2000);
				if(element1.getText().equalsIgnoreCase("May")) {
					element1.click();
					break;

			}
	           }
	   		
	   		driver.findElement(By.xpath("//input[@name='year']")).sendKeys("1989");
	   		
	   		driver.findElement(By.xpath("//i[@class='save icon']")).click();
	   		
	   		Thread.sleep(2000);
	   		driver.findElement(By.partialLinkText("Contacts")).click();
	   		
	   		driver.navigate().refresh();
	   		
	   		Thread.sleep(5000);
	   		
	   		driver.findElement(By.xpath("//td[text()='test@gmail.com']/parent::tr")).click();
	   		
	   		Thread.sleep(2000);
	   		
	   		driver.findElement(By.xpath("//i[@class='trash icon']")).click();
	   				
	   		Thread.sleep(2000);
	   		driver.findElement(By.xpath("//button[@class='ui button']")).click();
	   		
	   		driver.findElement(By.xpath("//div[@class='ui buttons']//div[@class='ui basic button floating item dropdown']")).click();
	   		
	   		Thread.sleep(2000);
	   		
	   		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
	   		
	   		Thread.sleep(2000);
	   		
	   		driver.close();
	}
	}
