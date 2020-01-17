package PackageLearnMaven.ProjectMavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;

	@Test
	public void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser launch");
		driver.get("https://opensource-demo.orangehrmlive.com/");

//		String driverPath = System.getProperty("user.dir") + "\\src\\test\\java\\BrowserDrivers\\chromedriver.exe";
//		// System.out.println(javaVersion);
//		System.setProperty("webdriver.chrome.driver", driverPath);
//
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		// driver.get("https://opensource-demo.orangehrmlive.com/");
//	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}
}
