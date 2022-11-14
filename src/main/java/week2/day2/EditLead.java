package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
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
		WebElement elementFindLink = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		elementFindLink.click();

		WebElement elementFirstName = driver
				.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]"));
		elementFirstName.sendKeys("Bala");

		WebElement elementFindLeadsButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		elementFindLeadsButton.click();

		WebElement elementLeadID = driver.findElement(By.linkText("10322"));
		elementLeadID.click();

		String title = driver.getTitle();
		System.out.println(title);
		String pagetitle = "iew Lead | opentaps CRM";

		if (title.equalsIgnoreCase(pagetitle)) {

			System.out.println("Expected Title is displayed properly " + title);

		} else {

			System.out.println("Expected Title is not displayed properly " + title);
		}

		WebElement elementEdit = driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Edit']"));
		elementEdit.click();

		WebElement elementUpdateCompanyName = driver.findElement(By.id("updateLeadForm_companyName"));
		elementUpdateCompanyName.clear();
		elementUpdateCompanyName.sendKeys("Campgemini");
		WebElement elementUpdate = driver.findElement(By.xpath("//input[@value='Update']"));
		elementUpdate.click();

		WebElement elementUpdatedCompanyName = driver.findElement(By.id("viewLead_companyName_sp"));
		String text = elementUpdatedCompanyName.getText();
		System.out.println(text);
		String updatedname = "ampgemini (10322)";

		if (text.equalsIgnoreCase(updatedname)) {

			System.out.println("Updated Name displayed properly " + text);

		} else {
			
			System.out.println("Updated Name not displayed properly " + text);
		}

		driver.close();
	}

}
