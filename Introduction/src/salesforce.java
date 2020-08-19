import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//create driver object
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\20321574387\\Documents\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=mx");
		
		driver.findElement(By.id("username")).sendKeys("Hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
		driver.findElementByClassName("button r4 wide primary").click();
		
		
		
		
		
		
	
	}

}
