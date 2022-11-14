package marathon.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 01) Launch Chrome
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// 02) Load https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// 03) Type "Bags" in the Search box
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Bags");
		// 04) Choose the third displayed item in the result (bags for boys)
		WebElement suggestionBox = driver
				.findElement(By.xpath("//div[@class='s-suggestion-container']//span[contains(text(),'for boys')]"));
		suggestionBox.click();
		/*
		 * 05) Print the total number of results (like 30000) 1-48 of over 30,000
		 * results for "bags for boys"
		 */
		String results = driver.findElement(By.xpath("//span[contains(text(),'1-48')]")).getText();
		System.out.println(results+ "Bag Boys");
		// 06)Choose New Arrivals (Sort)
		WebElement dropDown = driver.findElement(By.id("s-result-sort-select"));
		Select s = new Select(dropDown);
		s.selectByVisibleText("Newest Arrivals");
		driver.findElement(By.linkText("Newest Arrivals")).click();
		// 07)Click on Get it by tomorrow
		driver.findElement(By.xpath("//span[text()='Get It by Tomorrow']")).click();
		// 08)Print the total number of results (like 891)
		String text = driver.findElement(By.xpath("//span[contains(text(),'1-48')]")).getText();
		System.out.println(text + "Bags for Boyz");
		// 09)Confirm the results have got reduced (use step 05 for compare)

		if (results.equals(text)) {

			System.out.println("Results are equal");

		} else {

			System.out.println("Results are reduced");
		}

		// 10)Print the first resulting bag info (name, discounted price)
		System.out
				.println("Name of the bag is " + driver.findElement(By.xpath("//span[text()='Mtroyaldia']")).getText());
		System.out.println("Discounted prize of the bag is  "
				+ driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText());
		// 11)Get the number of bags with Deals of the Days
		driver.findElement(By.xpath("//span[text()=\"Today's Deals\"]")).click();

		WebElement dealBags = driver.findElement(By.xpath("//span[contains(text(),'1-48 of 72 results for')]"));
		System.out.println(dealBags.getText() + "Deals of the days");
		// 12)Get the color of the Deals of the Days
		List<WebElement> numberOfColor = driver
				.findElements(By.xpath("//ul[@class='a-unordered-list a-nostyle a-horizontal a-spacing-medium']/li"));
		System.out.println("Total Number of colors available " + numberOfColor.size());
		// 13)Click on the First Deal of the day
		driver.findElement(By.xpath("//a/span[contains(text(),'Evo 42 L')]")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> l=new ArrayList<String>(windowHandles);
		String childWindow = l.get(1);
		driver.switchTo().window(childWindow);
		// 14)Take screenshot and close
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snaps/bag.png");
		FileUtils.copyFile(source, destination);

	}

}
