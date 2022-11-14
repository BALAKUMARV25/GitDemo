package week3.assignment.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };

		int length = data.length;
		System.out.println(length);

		Set<Integer> s = new TreeSet<Integer>();

		for (int i = 0; i < length; i++) {
			s.add(data[i]);

		}

		System.out.println(s);

		List<Integer> list = new ArrayList<Integer>(s);
		int size = list.size();
		System.out.println(size);
		System.out.println(list.get(size-2));

	}

}
