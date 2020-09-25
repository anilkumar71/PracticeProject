package USTProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","D:\\Seleniumfile\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		//*[@id="product"]/tbody/tr[4]/td[2]
		
		String beforeXpath = "//*[@id=\"product\"]/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for(int i= 3;i<=11;i++) {
			String actualXpath = beforeXpath+i+afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			
			if(element.getText().equals("Rahul Shetty")) {
				System.out.println("Instructor :" + element.getText() + " is found" + " at position " + i);
				break;
			}
		}

	}

}
