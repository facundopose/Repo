package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class computerDatabasePage 
{
    WebDriver driver;

    By searchbox  = By.id("searchbox");
    By filterbutton = By.id("searchsubmit");
    By title =By.xpath("/html[1]/body[1]/section[1]/h1[1]");
    By addcomputer = By.id("add");        
    By firstelement = By.xpath("/html[1]/body[1]/section[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]");
    By alert = By.xpath("/html[1]/body[1]/section[1]/div[1]");
    		
    public computerDatabasePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setsearch(String computer)
    {
        driver.findElement(searchbox).sendKeys(computer);
    }    

    public void clickFilter()
    {
        driver.findElement(filterbutton).click();
    }
    
    public void clickelement()
    {
    	driver.findElement(firstelement).click();
    }
    public void add()
    {
    	
        driver.findElement(addcomputer).click();
    }

    public String getTitle()
    {
    	
    	return driver.findElement(title).getText();

    }
    
    public String getAlert()
    {
    	return driver.findElement(alert).getText();
    }
    

    public void search(String search)
    {

    	this.setsearch(search);
        this.clickFilter();        
    }
    
    public void addComputer()
    {
    	this.add();
    }
    
}
