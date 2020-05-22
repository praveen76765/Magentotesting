

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POM {
    
	@Test
	public void credential()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		Welcome w=new Welcome(driver);
		w.clickMyaccount();
		Login l=new Login(driver);
		l.Enteremail();
		l.enterpass();
		l.clicklogin();
		
		MyAccount myacc=new MyAccount(driver);
		myacc.clickonlogout();
		driver.quit();
		
		
		
		

	}

}
