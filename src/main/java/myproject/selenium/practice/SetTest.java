package myproject.selenium.practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import io.cucumber.java.tlh.latlh;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> s=new LinkedHashSet<Integer>();
		
		s.add(5);
		s.add(10);
		s.add(9);
		s.add(10);
		s.addAll(s);
		System.out.println(s);
	
		System.out.println("Bala");
	System.out.println("Naga");
	System.out.println("Shan");
	
	System.out.println("Bala2");
	System.out.println("Naga2");
	System.out.println("Shan3");
	
	
	
	}
		
	
}
