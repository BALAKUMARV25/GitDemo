package marathon.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		// 01) Launch Firefox / Chrome
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// 02) Load https://www.redbus.in/
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//03) Type "Chennai" in the FROM text box
		driver.findElement(By.id("src")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		//04) Type "Bangalore" in the TO text box
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		//05) Select tomorrow's date in the Date field
		driver.findElement(By.id("onward_cal")).click();
		WebElement datePicker = driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//tr/td[text()='27']"));
		datePicker.click();
		//06) Click Search Buses
		driver.findElement(By.id("search_btn")).click();
		//07) Print the number of buses shown as results (104 Buses found)
		String text = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
		System.out.println(text);
		//08) Choose 'After 6 pm' checkbox in DEPARTURE TIME 
		driver.findElement(By.xpath("(//label[@class='custom-checkbox'])[4]")).click();
		//09) Print the name of the second resulting bus 
		String text1 = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
		System.out.println("After 6pm "+text1);
		//10) Click the VIEW SEATS of that bus
		driver.findElement(By.xpath("(//div[text()='View Seats'])[1]")).click();
		Thread.sleep(10);
		//11) Take screenshot and close browser
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File destination=new File("./snaps/redbus.png");
		FileUtils.copyFile(screenshotAs, destination);
		
		driver.close();
	}

}
