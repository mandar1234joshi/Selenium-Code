package actiTimePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeHomePage {

	//declaration
	private WebElement logo;
	private WebElement logout;
	WebDriver driver;
		
	//initialization
	public ActiTimeHomePage(WebDriver driver)
	{
	this.driver = driver;
	logo = driver.findElement(By.xpath("//img[@height='61']"));              
	logout = driver.findElement(By.xpath("//a[@id='logoutLink']"));            
	}
	//Usage
	public void setActiTimeLogo()
	{
	   boolean res = logo.isDisplayed();
			
			if(res == true)
			{
				System.out.println("Test Case Passed :" + res);
			}
			else
			{
				System.out.println("Test Case Failed :" + res);
			}
		}
	public void setActiTimeLogoutButton()
		{
			logout.click();
		}
}
