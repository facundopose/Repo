

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//create driver object
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\20321574387\\Documents\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle()); // get page title
		
		System.out.println(driver.getCurrentUrl()); //validate url
		
		//System.out.println(driver.getPageSource()); //obtener codigo fuente
		
		driver.get("http://yhaoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		
		//driver.close(); //it closes current browser
		driver.quit(); //it closes all the browser opened by selenium  
	}

}
