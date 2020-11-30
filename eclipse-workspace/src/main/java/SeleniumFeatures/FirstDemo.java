package SeleniumFeatures;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstDemo {
	
	WebDriver driver;
	
	driver = new InternetExplorerDriver();
	driver.get("url of app");
	
	
	driver.close();

}
