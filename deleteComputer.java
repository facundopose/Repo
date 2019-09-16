package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.computerDatabasePage;
import POM.newComputerPage;
import POM.computerPage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class deleteComputer
{

    WebDriver driver;
    computerDatabasePage homepage;
    computerPage modifycomputer;

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
    	Assert.assertTrue(title.toLowerCase().contains("found"));	
    	
    	homepage.search("ARRA");
    	Assert.assertTrue(title.toLowerCase().contains("found"));
    	homepage.clickelement();
    	
    	modifycomputer = new computerPage(driver);	    
    	modifycomputer.clickDelete();
    	
    	String alert = homepage.getAlert();	    
    	Assert.assertTrue(title.toLowerCase().contains("deleted"));
    }

}
