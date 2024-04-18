package DriverSetup;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class SetupDriver {
	public static WebDriver driver;
	public static ChromeOptions options;
	public static EdgeOptions edge;

	
	public static WebDriver edgedriver()
	{
		WebDriverManager.edgedriver().setup();
		edge = new EdgeOptions();
		edge.addArguments("start-maximized"); 
//		edge.addArguments("incognito");
		edge.addArguments("disable-notifications");
		edge.addArguments("disable-popup-blocking");
//		edge.addArguments("headless");
		edge.addArguments("disable-blink-features-AutomationControlled");
	    driver = new EdgeDriver(edge);
	    driver.get("https://www.nobroker.in/");
		return driver;
	}
	public static WebDriver chromedriver()
	{
		WebDriverManager.edgedriver().setup();
		options = new ChromeOptions();
		options.addArguments("start-maximized"); 
//		options.addArguments("incognito");
		options.addArguments("disable-notifications");
		options.addArguments("disable-popup-blocking");
//		options.addArguments("headless");
		options.addArguments("disable-blink-features-AutomationControlled");
	    driver = new ChromeDriver(options);
	    driver.get("https://www.nobroker.in/");
		return driver;
	}
}