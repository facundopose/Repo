import org.openqa.selenium.chrome.ChromeDriver;

public class testCase2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//create driver object
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\20321574387\\Documents\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		
	}


}