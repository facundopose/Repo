import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//create driver object
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\20321574387\\Documents\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://gitlab.trimix.com.ar/users/sign_in");
		
		driver.findElement(By.id("user_login")).sendKeys("This is my first code");
		driver.findElementByName("user[password]").sendKeys("123456");
		driver.findElementByLinkText("Forgot your password?").click();
		
		
		
		
		
		
	
	}


}
