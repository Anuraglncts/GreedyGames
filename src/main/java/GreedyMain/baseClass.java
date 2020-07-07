package GreedyMain;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class baseClass 
{
	public WebDriver driver;
	public WebDriver InitializeBrowser() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Maven-GreedyGames\\src\\main\\java\\GreedyMain\\com.properties");
		prop.load(file);
		
		String Browser=prop.getProperty("browser");
		
		if(Browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver.exe");
			driver =new ChromeDriver();
			
			
		}
		else if(Browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		else if(Browser.equals("IE"))
		{
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;

}

}
