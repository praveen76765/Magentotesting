

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {
	
	WebDriver driver;
	By Myacc=By.linkText("My Account");

	public Welcome(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	public void clickMyaccount()
	{
		driver.findElement(Myacc).click();
	}
	

}
