package GreedyMain;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validate {
	public WebDriver driver;

	By AppTitle = By.xpath("//h1[@class='AHFaub']/span");
	By AppReview = By.xpath("//span[@class='AYi5wd TBRnV']/span");
	By AppUpdateDate = By.xpath("(//div[@class='IQ1z0d']/span)[1]");

	public Validate(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement AppTitle() {
		return driver.findElement(AppTitle);
	}

	public WebElement AppReview() {
		return driver.findElement(AppReview);
	}

	public WebElement AppUpdateDate() {
		return driver.findElement(AppUpdateDate);
	}		
		
	
	
}
