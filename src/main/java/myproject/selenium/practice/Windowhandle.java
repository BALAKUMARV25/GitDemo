package myproject.selenium.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandle {

	public ChromeDriver driver;

	@BeforeMethod

	public void invokeChromeBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test

	public void windowHandling() {

		driver.get("https://leafground.com/");

		driver.findElement(By.xpath("//i[contains(@class,'pi pi-globe layout-menuitem-icon')]")).click();
		driver.findElement(By.xpath("//span[text()='Window']")).click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		// Convert Set into List to Navigate another window

		List<String> l = new ArrayList<String>(windowHandles);
		// Returns Parent window ref id
		String parentWindow = l.get(0);
		// Returns child window ref id
		String childWindow = l.get(1);
		// By using the refid switch the window
		driver.switchTo().window(childWindow);
		// To get the title of the child window
		System.out.println(driver.getTitle());
		// Close the child window
		driver.close(); // -->it will close the current session only so parent window remains
		// Need to switch the driver to parent window else it search for Child window so
		// exception return
		driver.switchTo().window(parentWindow);
		// Now it will get the title of the parent window
		System.out.println(driver.getTitle());

	}

	@AfterMethod
	public void closeBrowser() {
		// it will close all the session running in current driver
		driver.quit();
	}

}
