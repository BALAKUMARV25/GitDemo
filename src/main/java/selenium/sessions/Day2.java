package selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement locatingUsername = driver.findElement(By.id("username"));
		locatingUsername.sendKeys("DemoSalesManager");
		WebElement locatingPassword = driver.findElement(By.name("PASSWORD"));
		locatingPassword.sendKeys("crmsfa");
		WebElement clickLoginButton = driver.findElement(By.className("decorativeSubmit"));
		clickLoginButton.click();
		
		WebElement xpathIdentifyLink = driver.findElement(By.xpath("//a[contains(text(),'CRM')]"));
		xpathIdentifyLink.click();
		
		WebElement xpathLeadsLink = driver.findElement(By.xpath("//a[text()='Leads']"));
		xpathLeadsLink.click();
		
		WebElement xpathCreateLeadLink = driver.findElement(By.xpath("//a[text()='Create Lead']"));
		xpathCreateLeadLink.click();
		
		WebElement xpathCompanyName = driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
		xpathCompanyName.sendKeys("InfoSy");
		
		WebElement xpathFirstName = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		xpathFirstName.sendKeys("Bala");

		WebElement xpathLastName = driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		xpathLastName.sendKeys("Siva");
		
		WebElement xpathClickCreateLead = driver.findElement(By.xpath("//input[@value='Create Lead']"));
		xpathClickCreateLead.click();
		
		
		
		
		
	}

}
