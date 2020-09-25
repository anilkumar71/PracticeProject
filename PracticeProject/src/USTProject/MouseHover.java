package USTProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import com.sun.tools.javac.util.List;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Seleniumfile\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(ele).perform();
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='mouse-hover-content']//a"));
		
		for(WebElement element : elements)
		{
			if(element.getText().equals("Reload"))
			{ 
				Thread.sleep(2000);
				element.click();
				break;
			}
		}

		driver.close();
		

	}

}
