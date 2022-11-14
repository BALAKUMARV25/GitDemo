package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int count=0 1 1 2 3 5 8 13 21 35 56 
		
		int firstNum = 0, secNum = 1, sum = 0;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 0; i <=11; i++) {
			
			sum=firstNum+secNum;
			
			firstNum=secNum;
			
			secNum=sum;
			
			System.out.println(sum);
			
		}
	
	}

}
