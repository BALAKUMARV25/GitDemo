package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.hpsf.Array;

public class CollectionListSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> s= new ArrayList<Integer>();
		
		s.add(1);
		s.add(22);
		s.add(3);
		s.add(54);
		s.add(65);
		s.add(22);
		s.add(43);
		s.add(67);
		s.add(98);
		s.add(1);
		
		int[] num = {1,22,3,54,65,22,43,67,98,1};
		
		int n1=num.length;
		
		Set<Integer> l=new TreeSet<Integer>(s);
		Set<Integer> e=new TreeSet<Integer>();
		System.out.println("Unique value is "+l);

		for(int i=0; i<n1; i++) {
			
			if(!e.add(num[i])) {
				System.out.println("Duplicate value is "+num[i]);
				
			}
			
			
		}
			
				
		
		
		
	}

}
