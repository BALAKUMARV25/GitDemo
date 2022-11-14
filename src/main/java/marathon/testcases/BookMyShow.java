package marathon.testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cityName = "Hyderabad";
		// 01) Launch Edge / Chrome
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// 02) Load https://in.bookmyshow.com/
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// 03) Type the city as "Hyderabad" in Select City
		driver.findElement(By.xpath("//input[@class='sc-jvEmr elijMA']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//span[@class='sc-fihHvN fUfZof']")).click();
		// 04) Confirm the URL has got loaded with Hyderabad
		String text = driver.findElement(By.xpath("//span[@class='sc-LKuAh kxVdmj ellipsis']")).getText();
		System.out.println(text);

		if (text.equals(cityName)) {

			System.out.println("Page loaded with Hyderabad city");

		} else {

			System.out.println("Page not loaded with Hyderabad city");
		}

		// 05) Search for your favorite movie
		driver.findElement(By.xpath("//span[@class='sc-jKVCRD jyFDAS']")).click();
		driver.findElement(By.xpath("//input[@class='sc-jvEmr elijMA']")).sendKeys("Liger");
		driver.findElement(By.xpath("//span[@class='sc-hdPSEv kzaUOq']")).click();
		// 06) Click Book Tickets
		driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='sc-vhz3gb-3 dRokFO'])[2]")).click();
		// 07) Print the name of the theater displayed first
		String text2 = driver.findElement(By.className("__venue-name")).getText();
		System.out.println(text2);
		// 08) Click on the info of the theater
		driver.findElement(By.className("venue-info-text")).click();
		
		List<WebElement> findElements = driver
				.findElements(By.className("//div[@class='venue-facilities']/div[@class='venue-facility-item']"));
		int count = findElements.size();

		for (int i = 0; i < count; i++) {

			String text3 = findElements.get(i).getText();
			System.out.println(text3);
		}

	}

}
