package selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {

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

		WebElement locatingWelcomeMessage = driver.findElement(By.tagName("h2"));

		String welcomeText = locatingWelcomeMessage.getText();
		System.out.println(welcomeText);

		WebElement clickLinkText = driver.findElement(By.linkText("CRM/SFA"));
		clickLinkText.click();
		WebElement clickLeadsLink = driver.findElement(By.linkText("Leads"));
		clickLeadsLink.click();
		WebElement clickCreateLeadsLink = driver.findElement(By.linkText("Create Lead"));
		clickCreateLeadsLink.click();

		WebElement locatingCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		locatingCompanyName.sendKeys("PLINTRON");

		WebElement locatingFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		locatingFirstName.sendKeys("Bala");

		WebElement locatingLastName = driver.findElement(By.id("createLeadForm_lastName"));
		locatingLastName.sendKeys("Kumar");

		WebElement locationgSourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		locationgSourceDD.sendKeys("cold call");

		WebElement locatingMarketingDD = driver.findElement(By.name("marketingCampaignId"));

		Select marketingDD = new Select(locatingMarketingDD);
		marketingDD.selectByIndex(8);

		WebElement locatingIndustryDD = driver.findElement(By.name("industryEnumId"));

		Select industryDD = new Select(locatingIndustryDD);
		industryDD.selectByVisibleText("Insurance");

		WebElement locatingOwnershipDD = driver.findElement(By.name("ownershipEnumId"));

		Select ownershipDD = new Select(locatingOwnershipDD);
		ownershipDD.selectByValue("OWN_SCORP");

		// driver.close();

	}

}
