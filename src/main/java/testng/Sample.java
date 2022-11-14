package testng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	public ChromeDriver driver;

	@BeforeMethod

	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
	}

	@Test
	public void Leafground() {
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
	}
	
	@AfterMethod
	public void screenShot() throws IOException {
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination=new File("./snaps/leafground.png");
		FileUtils.copyFile(source, destination);
		
	}
	
	
	
}
