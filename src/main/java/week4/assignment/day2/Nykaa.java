package week4.assignment.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement mouseHover = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions a = new Actions(driver);
		a.moveToElement(mouseHover).build().perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		String textTitle = driver.getTitle();
		System.out.println(textTitle);
		if (textTitle.contains("L'Oreal Paris")) {

			System.out.println("Expected Title Displayed ");

		} else {

			System.out.println("Expected Title Not Displayed");
		}

		driver.findElement(By.className("arrow-icon")).click();
		driver.findElement(By.xpath("//span[contains(text(),'top rated')]")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Hair']")).click();

		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Colour Protect Shampoo')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> l = new ArrayList<String>(windowHandles);
		String childWindow = l.get(1);
		String parentWindow = l.get(0);
		driver.switchTo().window(childWindow);
		String text = driver.findElement(By.xpath("//div[@class='css-f5j3vf']/div")).getText();
		System.out.println("Price tag " + text);
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		String text2 = driver.findElement(By.xpath("(//div[contains(@class,'table-row')])[4]")).getText();
		System.out.println("Grand Total is " + text2);

		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.findElement(By.xpath("//*[text()='CONTINUE AS GUEST']")).click();
		String text3 = driver.findElement(By.xpath("//div[contains(@class,'grand-total-cell prl20')]")).getText();
		System.out.println(text3);
		if (text2 == text3) {

			System.out.println("Total Amount is proper");

		} else {

			System.out.println("Total Amount is not proper");
		}

	}

}
