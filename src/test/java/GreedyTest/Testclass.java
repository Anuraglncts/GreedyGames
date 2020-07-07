package GreedyTest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import GreedyMain.StoreHomePage;
import GreedyMain.Validate;
import GreedyMain.baseClass;

public class Testclass extends baseClass
{
	@Test
	public void TestCases() throws IOException
	{
		driver=InitializeBrowser();
		driver.get("https://play.google.com/store/apps/top");
		
		StoreHomePage s=new StoreHomePage(driver);
		s.SearchApp().sendKeys("open Appliances");
		s.Search().click();
		s.Appname().click();
		
		Validate v=new Validate(driver);
		String title=v.AppTitle().getText();
		Assert.assertEquals( title , "Openapp Business");
		System.out.println("Name of app is"+" "+title);

		
		
		String Review=v.AppReview().getText();
		Assert.assertEquals(Review, "295");
		System.out.println("No of review is"+ " "+Review);
		
		String Date=v.AppUpdateDate().getText();
		Assert.assertEquals(Date, "June 15, 2020");
		System.out.println("App was updated on "+" "+ Date);
		
		
		
	}
	
	@AfterTest
	public void Score()
	{
		Validate v=new Validate(driver);	    
		int review=Integer.valueOf(v.AppReview().getText());		
		
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		 String dateBeforeString = "15 06 2020";
		 String dateAfterString = "07 07 2020";

		 try {
		       Date dateBefore = myFormat.parse(dateBeforeString);
		       Date dateAfter = myFormat.parse(dateAfterString);
		       long difference = dateAfter.getTime() - dateBefore.getTime();
		       float daysBetween = (difference / (1000*60*60*24));
		       System.out.println("Number of Days between dates: "+daysBetween);
		       int Score1=(int) (review/daysBetween);
		       System.out.println("score is"+" "+Score1);
		 } catch (Exception e) {
		       e.printStackTrace();
		 } 
	}
}
