package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

@Test

public void runAlert() {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Browser']/ancestor::a")).click();
		driver.findElement(By.xpath("//li[@id='menuform:m_overlay']")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']/following-sibling::button[contains(@class,'ui-button')]")).click();
		Alert alert2 = driver.switchTo().alert();
		String text2 = alert2.getText();
		System.out.println(text2);
		alert2.dismiss();
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button[contains(@class,'')]")).click();
		Alert alert3 = driver.switchTo().alert();
		String text3 = alert3.getText();
		System.out.println(text3);
		alert3.sendKeys("Bala");
		alert3.accept();
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Confirmation)']/following-sibling::button")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-dialog-buttonpane')]/button)[1]")).click();
		
		
		
	}

}
