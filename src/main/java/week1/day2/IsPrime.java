package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		
		int a=9;
		
		boolean flag=true;
		
		for(int i=2;i<a;i++) {
			
			if (a%i==0) {
				
				 flag = false;
			}
			
		}
		
		if(flag) {
			
			System.out.println("it is a prime number");
		}
		
		else {
			
			System.out.println("it is not a prime number");
		}
			
			
		
	}
	
}
