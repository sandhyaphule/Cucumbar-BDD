package qa;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory 
{
	static WebDriver driver; //this constructor
	
	public WebDriver initBrowser()
	{
		 driver = new ChromeDriver();
		 
		 return driver;
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}

}

//In pagefactory will be done using Constructor to utilize those in methods
