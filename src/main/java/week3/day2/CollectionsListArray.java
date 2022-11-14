package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class CollectionsListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l = new ArrayList<String>();

		l.add("Karthi");
		l.add("Arun");
		l.add("Dev");
		l.add("Selva");
		l.add("Anbu");
		l.add("Sekar");

		System.out.println(l);
		int s = l.size();
		System.out.println(s);

		for (int i = 0; i < s; i++) {
			
			String text = l.get(i);
			
			if(text.startsWith("S")) {
				
				System.out.println(text);
			}
			
		}
		
		
		List<Integer> n=new ArrayList<Integer>();
		n.add(1);
		
		
		
		
	}


	
	
}
