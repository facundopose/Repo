package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class newComputerPage 
{
	WebDriver driver;
	
	By title =By.xpath("//h1[contains(text(),'Add a computer')]");
	
    By name  = By.id("name");
    By introducedDate = By.id("introduced");
    By discontinuedDate = By.id("discontinued");
    By company = By.id("company");
  
    By create = By.xpath("/html[1]/body[1]/section[1]/form[1]/div[1]/input[1]");
    By cancel = By.xpath("/html[1]/body[1]/section[1]/form[1]/div[1]/a[1]");
    
    
    public newComputerPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setComputer(String n)
    {
        driver.findElement(name).sendKeys(n);
    }    

    public void setintroducedDate(String date)
    {
        driver.findElement(introducedDate).sendKeys(date);
    }   
    public void setdiscontinuedDate(String date)
    {
        driver.findElement(discontinuedDate).sendKeys(date);
    }   
    
    public void setcompany(String a)
    {
        Select s = new Select((WebElement) company);
        s.selectByVisibleText(a);
    	
    }   
    public void clickCreate()
    {
        driver.findElement(create).click();
    }
    
    public void clickCancel()
    {
    	
        driver.findElement(cancel).click();
    }

    public String getTitle()
    {
    	
    	return driver.findElement(title).getText();

    }

    public void createComputer(String n,String d1, String d2, String s)
    {

    	this.setComputer(n);
        this.setintroducedDate(d1);
        this.setdiscontinuedDate(d2);
        this.setcompany(s);;
        this.clickCreate();
    }
    


}
