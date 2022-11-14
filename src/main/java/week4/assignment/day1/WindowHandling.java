package week4.assignment.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("DemoSalesManager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//td//div[@jsid='partyIdFromComboBoxStore']/following-sibling::a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> l = new ArrayList<String>(windowHandles);
		String childWindow = l.get(1);
		String parentWindow = l.get(0);
		driver.switchTo().window(childWindow);
		driver.findElement(By.linkText("DemoCustomer")).click();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//td//div[@jsid='partyIdToComboBoxStore']/following-sibling::a")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> l1 = new ArrayList<String>(windowHandles2);
		String childWindow2 = l1.get(1);
		String parentWindow2 = l1.get(0);
		driver.switchTo().window(childWindow2);
		driver.findElement(By.xpath("//a[text()='FrenchCustomer']")).click();
		driver.switchTo().window(parentWindow2);
		driver.findElement(By.className("buttonDangerous")).click();

		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();

		System.out.println(driver.getTitle());

	}

}
