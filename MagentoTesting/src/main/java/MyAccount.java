

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount {
	
	WebDriver driver;
	By text=By.linkText("Log Out");

	public MyAccount(WebDriver driver)
	{
		this.driver=driver;	
		
	}
	public void clickonlogout()
	{
		driver.findElement(text).click();
	}
}
