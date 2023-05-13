package actiTimeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import actiTimePOM.ActiTimeHomePage;
import actiTimePOM.ActiTimeLoginPage;

public class ActiTimeTesting {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\chromedriver.exe");	
		
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");

	WebDriver driver = new ChromeDriver(options);	
		
	driver.manage().window().maximize();
	/*	
	driver.get("https://www.amazon.in/");
	
	Actions act=new Actions(driver);
	WebElement q = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	act.moveToElement(q).perform();
	*/
	driver.get("http://localhost/login.do");
		
	Thread.sleep(2000);
		
	ActiTimeLoginPage f = new ActiTimeLoginPage(driver);
	f.setActitimeUn();
	f.setActitimepwd();
	f.setActitimeLoginButton();
	
	ActiTimeHomePage g = new ActiTimeHomePage(driver);
	g.setActiTimeLogo();
	g.setActiTimeLogoutButton();
		
	driver.quit();	
	
	}
}
