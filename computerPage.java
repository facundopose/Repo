package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class computerPage 
{
	WebDriver driver;
	
	By title =By.xpath("//h1[contains(text(),'Add a computer')]");
	
    By name  = By.id("name");
    By introducedDate = By.id("introduced");
    By discontinuedDate = By.id("discontinued");
    By company = By.id("company");
  
    By save = By.xpath("/html[1]/body[1]/section[1]/form[1]/div[1]/input[1]");
    By cancel = By.xpath("/html[1]/body[1]/section[1]/form[1]/div[1]/a[1]");
    By delete = By.xpath("/html[1]/body[1]/section[1]/form[2]/input[1]");
    
    public computerPage(WebDriver driver)
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
    
    public void company(String a)
    {
        Select s = new Select((WebElement) company);
        s.selectByVisibleText(a); 	
    }   
    public void clickSave()
    {
        driver.findElement(save).click();
    }
    
    public void clickCancel()
    {  	
        driver.findElement(cancel).click();
    }
    
    public void clickDelete()
    {
    	driver.findElement(delete).click();
    }

    public String getTitle()
    {   	
    	return driver.findElement(title).getText();
    }

    public void modifyComputer(String n,String d1, String d2, String s)
    {

    	this.setComputer(n);
        this.setintroducedDate(d1);
        this.setdiscontinuedDate(d2);
        this.setintroducedDate(s);
        this.clickSave();
    }
    
    public void deleteComputer()
    {
    	this.clickDelete();
    }
    
  


}
