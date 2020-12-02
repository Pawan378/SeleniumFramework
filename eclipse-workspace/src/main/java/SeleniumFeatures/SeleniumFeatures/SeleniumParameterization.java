import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumParameterization {
	
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavan\\Desktop\\ChromeDriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://10.82.180.36/Common/Login.aspx");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		@After
		public void tearDown() throws Exception
		{
			Thread.sleep(6000);
			driver.close();
		}
		
		driver.findElement(By.id("body_txtUserID")).sendKeys("pawan02");
		driver.findElement(By.name("ct100$body$txtPassword")).sendKeys("pawan@123");
		driver.findElement(By.xpath("//[@id=\"bogy_btnLogin\"]")).click();
		driver.findElement(By.linkText("Account Request Status")).click();
		
		WebElement table1 = driver.findElement(By.id("body_cph_MyAccount_gvViewAccountRequestStatus"));
		List<WebElement> rows1 = table1.findElements(By.tagName("tr"));
		
		System.out.println(rows1.size());
		
		for(int i=1;i < rows1.size(); i++)
		{
			List<WebElement> cols = rows1.get(i).findElements(By.tagName("td"));
			System.out.println(cols.size());
			System.out.println(cols.get(1).getText());
			for(WebElement col:cols)
			{
				System.out.println(col.getText());
			}
			
			
		}
		
		
		
	}

}
