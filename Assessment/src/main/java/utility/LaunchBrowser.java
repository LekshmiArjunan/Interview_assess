package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class LaunchBrowser {
	public  WebDriver driver;
	Screenshots objScreenshot = new Screenshots();
	WaitConditions objwaitconditions = new WaitConditions();
	public static Properties prop;
	
	public static void testBasic() throws IOException {
		prop =new Properties();
		FileInputStream fileIo=new FileInputStream(System.getProperty("user.dir")+"src\\test\\resources\\config.properties");
		prop.load(fileIo);
		
		
	}
	
@Parameters("browser")
@BeforeMethod(alwaysRun = true)
	public void launchingBrowser(String url, String browser) throws Exception  {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty(
					"webdriver.chrome.driver",
					"C:\\Users\\RJ\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");	
				@SuppressWarnings("unused")
				WebDriver driver = new ChromeDriver();
				
//				driver.manage().window().maximize();
//				driver.get(url);
//				Thread.sleep(3000);
		}
//			System.setProperty(
//					"webdriver.chrome.driver",
//					"C:\\Users\\RJ\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");				
//				WebDriver driver = new ChromeDriver();
//		} 
		else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty(
					"webdriver.firefox.marionette.driver",
					"C:\\Users\\RJ\\Downloads\\drive\\geckodriver-v0.33.0-win32\\geckodriver.exe");
								
				@SuppressWarnings("unused")
				WebDriver driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty(
					"webdriver.edge.driver",
					"C:\\Users\\RJ\\Downloads\\drive\\edgedriver_win64\\msedgedriver.exe");
								
				@SuppressWarnings("unused")
				WebDriver driver = new EdgeDriver();
		} 
//		else {
//			System.out.println("No option for this Browser");
//		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		objwaitconditions.implicitWait(driver);

}


//public void closeBrowser() {
//driver.close();
//}

@SuppressWarnings("static-access")
@AfterMethod(alwaysRun = true)
public void afterMethod(ITestResult iTestResult) throws IOException {
	if (iTestResult.getStatus() == iTestResult.FAILURE) {
		objScreenshot.failureScreenshot(driver, iTestResult.getName());
	}
	
	driver.close();
}

//@BeforeTest(alwaysRun = true)
////@Parameters({ "Url", "Browser" })
//public WebDriver beforeTest(String Url, String Browser) throws Exception {
//	ReadConfigProperties readdataprop = new ReadConfigProperties();
//	launchingBrowser(readdataprop.geturl(),  readdataprop.getbrowser());
//	this.driver = driver;
//	return driver;
//}

//@AfterTest(alwaysRun = true)
//public void afterTest() {
//	closeBrowser();
//	this.driver = driver;
//}

// 

}




