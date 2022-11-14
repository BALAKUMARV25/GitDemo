package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
		WebElement elementPhone = driver.findElement(By.xpath("//span[text()='Phone']"));
		elementPhone.click();

		WebElement elementPhoneNum = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		elementPhoneNum.sendKeys("6487912167584621");

		WebElement elementFindLeads = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		elementFindLeads.click();

		WebElement elementLeadId = driver.findElement(By.linkText("10669"));
		elementLeadId.click();

		WebElement elementDelete = driver.findElement(By.xpath("//a[text()='Delete']"));
		elementDelete.click();

		WebElement elementFindLead = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		elementFindLead.click();

		WebElement elementPhone1 = driver.findElement(By.xpath("//span[text()='Phone']"));
		elementPhone1.click();

		WebElement elementPhoneNum1 = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		elementPhoneNum1.sendKeys("6487912167584621");

		WebElement elementFindLeads1 = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		elementFindLeads1.click();

		WebElement elementAlert = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String text = elementAlert.getText();
		System.out.println(text);
		String compareText = "No records to display";

		if (text.equals(compareText)) {

			System.out.println("deletion Successfull");

		} else {

			System.out.println("deletion Unsuccessfull");
		}
		
		driver.close();
		
	}

}
