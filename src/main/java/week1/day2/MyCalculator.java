package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal=new Calculator();
		
		int add = cal.addition();
		System.out.println(add);

		int sub = cal.subtraction();
		System.out.println(sub);
		
		double mul = cal.multiplication();
		System.out.println(mul);
		
		float div = cal.division();
		System.out.println(div);
		
	}

}
