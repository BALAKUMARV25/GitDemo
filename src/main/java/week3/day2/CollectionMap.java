package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.collections4.map.LinkedMap;

public class CollectionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map=new LinkedMap<Integer, String>();
		map.put(2775, "Bala");
		map.put(2785, "Naga");
		map.put(2776, "Shan");
		
		System.out.println(map);
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		for(Entry<Integer, String> eachEntry :entrySet) {
			
			System.out.println(eachEntry.getKey()+" " +eachEntry.getValue());
	
		}
		

	}

}
