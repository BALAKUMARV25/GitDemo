package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};

		int count = arr.length;
		
		System.out.println("Length of the given array is "+ count);
		
		for (int i=0;i<count;i++) {
			
			for (int j=i+1;j<count;j++) {
				
				if (arr[i]==arr[j]) {
					
					int k = arr[j];
					
					System.out.println("Duplicate element present in an given array is "+ k);
					
					
				}
				
				
			}
			
			
		}
		
	
	}

}
