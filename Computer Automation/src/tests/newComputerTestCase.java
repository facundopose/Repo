package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.computerDatabasePage;
import POM.newComputerPage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class newComputerTestCase
{

	    WebDriver driver;
	    computerDatabasePage homepage;
	    newComputerPage newcomputer;

	    @BeforeTest
	    public void setup(){

	        //driver = new FirefoxDriver();
	        ChromeDriver driver= new ChromeDriver();
	        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\20321574387\\Documents\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
	        driver.get("http://http://computer-database.herokuapp.com/computers");

	    }

	    @Test
	    public void testCreateNewComputer()
	    {

	    	homepage = new computerDatabasePage(driver);
	    	String title = homepage.getTitle();
	    	Assert.assertTrue(title.toLowerCase().contains("computers found"));	    
	    	homepage.addComputer();	    
	    	newcomputer = new newComputerPage(driver);	    
	    	newcomputer.createComputer("TEST", "01/02/2019", "01/02/2020", "IBM");	    
	    	String alert = homepage.getAlert();	    
	    	Assert.assertTrue(title.toLowerCase().contains("has been created"));
	    }
}
