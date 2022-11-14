package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement elementCreateAccount = driver.findElement(By.linkText("Create New Account"));
		elementCreateAccount.click();
		WebElement elementFirstName = driver.findElement(By.name("firstname"));
		elementFirstName.sendKeys("BalaV");
		WebElement elementLastName = driver.findElement(By.name("lastname"));
		elementLastName.sendKeys("Kumar");
		WebElement elementMobileNo = driver.findElement(By.name("reg_email__"));
		elementMobileNo.sendKeys("9942699055");
		WebElement elementPwd = driver.findElement(By.id("password_step_input"));
		elementPwd.sendKeys("123456");

		WebElement elementDay = driver.findElement(By.name("birthday_day"));
		Select s = new Select(elementDay);
		s.selectByValue("19");
		
		WebElement elementMonth = driver.findElement(By.name("birthday_month"));
		Select s1=new Select(elementMonth);
		s1.selectByVisibleText("Mar");
		
		WebElement elementYear = driver.findElement(By.name("birthday_year"));
		Select s2=new Select(elementYear);
		s2.selectByIndex(7);
		
		WebElement elementGender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		elementGender.click();
		
		
		
		

	}

}
