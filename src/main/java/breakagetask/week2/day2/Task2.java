package breakagetask.week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {

		public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://erail.in/");
			
			WebElement fromField = driver.findElement(By.id("txtStationFrom"));
			fromField.clear();
			
			fromField.sendKeys("MS",Keys.TAB);
			
			WebElement toField = driver.findElement(By.id("txtStationTo"));
			toField.clear();
			toField.sendKeys("PDY",Keys.TAB);
			
			WebElement sortCheckbox = driver.findElement(By.id("chkSelectDateOnly"));
			
			sortCheckbox.click();
			
			List<WebElement> findRows = driver.findElements(By.xpath("(//table)[3]//tbody/tr"));
			
			List<WebElement> findColumns = driver.findElements(By.xpath("(//table)[3]//tbody/tr[1]//td[1]"));
			
			
			int r = findRows.size();
			int c = findColumns.size();
			

			System.out.println(c-8);
			
			for(int i=1; i<=r;i++) {
				
				for (int j=1; j<=6;j++) {
					
					String text = driver.findElement(By.xpath("(//table)[3]//tbody/tr["+i+"]//td["+j+"]")).getText();
					System.out.print(text +"                 ");
				}
				
				System.out.println();
			}
			
			
			
			
			
			
			
			
			
			
	}

}
