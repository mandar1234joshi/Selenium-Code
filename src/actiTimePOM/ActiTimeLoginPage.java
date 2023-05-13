package actiTimePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeLoginPage {

	//declaration
	
	private WebElement un;
	private WebElement pwd;
	private WebElement login;
	WebDriver driver;
	
	//initialization
	
	public ActiTimeLoginPage(WebDriver driver)
	{
		this.driver = driver;
		un = driver.findElement(By.xpath("//input[@name='username']"));
		pwd = driver.findElement(By.xpath("//input[@name='pwd']"));
		login = driver.findElement(By.xpath("//a[@id='loginButton']"));
	}
	
	//usuage
	public void setActitimeUn()
	{
		un.sendKeys("admin");
	}
	
	public void setActitimepwd()
	{
		pwd.sendKeys("manager");
	}
	
	public void setActitimeLoginButton()
	{
		login.click();
	}

}
