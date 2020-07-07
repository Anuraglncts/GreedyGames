package GreedyMain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoreHomePage
{
	public WebDriver driver;
	
	By SearchApp= By.id("gbqfq");
	By Search=By.xpath("//button[@aria-label='Google Search']");
	By ClickOnApp=By.xpath("(//div[@title='Openapp Business'])");
	
	public StoreHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement SearchApp()
	{
		return driver.findElement(SearchApp);
	}
	
	public WebElement Search()
	{
		return driver.findElement(Search);
	}

	
	public WebElement Appname()
	{
		return driver.findElement(ClickOnApp);
	}

}
