package Web.Baseclass;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class baseclass {
	public static WebDriver driver;
	public static Properties prop;
	public baseclass () {
		try {
			prop =new Properties();
			FileInputStream ip = new
					FileInputStream("./config/config.properties");
			prop.load(ip);
			ip.close();
		} catch (Exception e) {
			System.out.println("The Exception taken as....."+" "+"e.getMessage()");
		}
	}
	public void openWindow() {
		String browsername = prop.getProperty("Browser");
		if(browsername.endsWith("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./webdrivers/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("The chrome browser has been open......");
		} else { 
			System.out.println("The chrome driver has not open");
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
		driver.manage().deleteAllCookies();
		System.out.println("The application was open orange.hrm"+ driver.getClass());
	}
	public void TearDown() {
		driver.close();
		System.out.println("The application was Closed");
	}
}