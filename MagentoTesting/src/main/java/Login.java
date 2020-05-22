

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	By e=By.id("email");
	By p=By.id("pass");
	By clk=By.id("send2");
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Enteremail()
	{
		driver.findElement(e).sendKeys("praveen76765@gmail.com");
	}
	public void enterpass()
	{
		driver.findElement(p).sendKeys("Ptwgjm.ad");
	}
	public void clicklogin()
	{
		driver.findElement(clk).click();
	}
	

}
