package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");
		System.out.println("Click and Confirm title.");
		WebElement elementClick = driver.findElement(By.xpath("//span[text()='Click']"));
		elementClick.click();
		driver.navigate().back();
		boolean enabledOrNot = driver.findElement(By.name("j_idt88:j_idt92")).isEnabled();
		System.out.println(enabledOrNot);

		if (enabledOrNot) {

			System.out.println("it is enabled");
		} else {

			System.out.println("it is disabled");
		}

		WebElement position = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		System.out.println(position.getLocation());

	}

}
