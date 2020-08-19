import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class computerAutomation 
{
	public static void main(String[] args) 
	{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\20321574387\\Documents\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
		
	driver.get("http://computer-database.herokuapp.com/computers");
	
	driver.findElementByXPath("/html[1]/body[1]/section[1]/h1[1]");
	
	driver.findElement(By.id("searchbox"));
	
	driver.findElement(By.id("searchsubmit"));
	
	driver.findElementByXPath("/html[1]/body[1]/section[1]/table[1]/thead[1]/tr[1]/th[1]");
	driver.findElementByXPath("/html[1]/body[1]/section[1]/table[1]/thead[1]/tr[1]/th[2]/a[1]");
	driver.findElementByXPath("/html[1]/body[1]/section[1]/table[1]/thead[1]/tr[1]/th[3]/a[1]");
	driver.findElementByXPath("/html[1]/body[1]/section[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]");

//	driver.findElement(By.id("searchbox"));
	}


}
