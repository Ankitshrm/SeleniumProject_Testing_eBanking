package com.eBankingV1.testCases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	public String baseUrl ="https://demo.guru99.com/V4/index.php";
	public String baseUsername ="mngr385101";
	public String basePassword ="budAhyn";
	public static WebDriver driver ;
	public static Logger log;
	
	
	
	@BeforeClass
	public void setup() {
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		log =Logger.getLogger("eBanking");
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
