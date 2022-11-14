package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public RemoteWebDriver driver;
	
	@Parameters({"url","browser"})
	@Test
	public void createData(String urlName, String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
		}else if (browserName.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		

		driver.manage().window().maximize();
		driver.get(urlName);

		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("DemoSalesManager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		WebElement elementLink = driver.findElement(By.linkText("CRM/SFA"));
		elementLink.click();
		WebElement elementLead = driver.findElement(By.linkText("Leads"));
		elementLead.click();
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("PLINTRON");
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Bala");
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("KumarV");
		WebElement elementFirstLocalName = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementFirstLocalName.sendKeys("BK");
		WebElement elementDepartName = driver.findElement(By.name("departmentName"));
		elementDepartName.sendKeys("Testing");
		WebElement elementDesc = driver.findElement(By.xpath("//textarea[@name='description']"));
		elementDesc.sendKeys("Nothing to worry be happy");
		WebElement elementEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmail.sendKeys("bala@gmail.com");
		WebElement elementState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select s = new Select(elementState);
		s.selectByVisibleText("Alabama");
		WebElement elementCreate = driver.findElement(By.name("submitButton"));
		elementCreate.click();
		System.out.println(driver.getTitle());

	}

}
