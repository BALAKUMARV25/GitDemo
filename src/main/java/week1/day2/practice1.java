package week1.day2;

import java.util.Arrays;

public class practice1 {
	
	public static void main(String[] args) {
		
		for (int i=51; i<=77;i++) {
			
			if(i%2!=0) {
				
				System.out.println("The odd number is "+i);
			}
			
			
		}
		
		
		int[] array= {22,67,98,1,34,58,99};
		
		int count = array.length;
		
		Arrays.sort(array);
		
		System.out.println("The second largest number is "+array[count-2]);
			
			
		}
			}


