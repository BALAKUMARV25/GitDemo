package myproject.selenium.practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> s = new ArrayList<String>();
		s.add("Bala");
		s.add("Shan");
		s.add("Naga");

		int size = s.size();

		for (int i = 0; i < size; i++) {

			System.out.println(s.get(i));
		}

	}

}
