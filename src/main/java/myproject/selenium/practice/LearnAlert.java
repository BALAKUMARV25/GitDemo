package myproject.selenium.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public ChromeDriver driver;

	@BeforeMethod

	public void invokeBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void alertLearning() {

		driver.get("https://leafground.com/alert.xhtml;jsessionid=node01wvqs2fsm23a46hz56yyswuvt355111.node0");
		driver.findElement(By
				.xpath("//h5[text()=' Alert (Simple Dialog)']/following-sibling::button[contains(@class,'ui-button')]"))
				.click();

		Alert a = driver.switchTo().alert();
		a.accept();

		driver.findElement(By.xpath(
				"//h5[text()=' Alert (Confirm Dialog)']/following-sibling::button[contains(@class,'ui-button')]"))
				.click();

		Alert a1 = driver.switchTo().alert();
		a1.dismiss();

		driver.findElement(By
				.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button[contains(@class,'ui-button')]"))
				.click();
		Alert a3 = driver.switchTo().alert();
		String text = a3.getText();
		System.out.println(text);
		a3.sendKeys("Bala");
		a3.accept();

	}

	@AfterMethod
	public void quitBrowser() throws IOException {
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		
		File f=new File("./snaps/alertverification.png");
		
		FileUtils.copyFile(screenshotAs, f);

		driver.quit();

	}

}
