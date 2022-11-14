package week1.day2;

public class Car {

	public void carBrand() {

		System.out.println("Lamborgini");
	}

	public String carColour() {

		return "Black";

	}

	public long carEngineNumber() {

		return 9632587412147l;

	}

	public int sumOfTwoNumbers(int k, int l) {

		int m = k + l;
		return m;
	}

	public int multiplyOfTwoNumbers(int a, int b) {

		int c = a * b;
		return c;
	}

	public int divisionOfTwoNumbers(int r, int s) {

		int t = r/s;
		return t;
	}

	
	public static void main(String[] args) {
		
	Car information=new Car();
	information.carBrand();
	String color = information.carColour();
	System.out.println(color);	
	long no=information.carEngineNumber();
	System.out.println(no);
	int sum = information.sumOfTwoNumbers(25, 28);
	System.out.println(sum);
	int mul=information.multiplyOfTwoNumbers(5, 5);
	System.out.println(mul);
	int div=information.divisionOfTwoNumbers(20, 10);
	System.out.println(div);
	

	
	}
	
}
