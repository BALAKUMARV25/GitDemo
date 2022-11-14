package week3.day1;

public class MyVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This belongs to Vehicle class methods");

		Vehicle v = new Vehicle();
		v.brake();
		v.sound();

		System.out.println();

		System.out.println("This belongs to Vehicle and Car class methods");
		
		Car c = new Car();
		c.sound();
		c.brake();
		c.entertainment();
		
		System.out.println();
		
		System.out.println("This belongs to Vehicle,Car and Bmw class methods");
		Bmw b = new Bmw();
		b.brake();
		b.sound();
		b.specialFeature();
		b.entertainment();
		
		System.out.println();
		
		System.out.println("This belongs to Vehicle,Car,Bmw and Audi class methods");
		
		Audi au = new Audi();
		au.brake();
		au.entertainment();
		au.sound();
		au.specialFeature();
		au.stability();
		
		
		System.out.println();
		
		System.out.println("This belongs to Vehicle,Car,Bmw,Audi and auto class methods");
		
		
		Auto a = new Auto();

		a.brake();
		a.entertainment();
		a.sound();
		a.specialFeature();
		a.stability();
		a.wheels();
		
		System.out.println();
		
		System.out.println("This belongs to Vehicle,Car,Bmw,Audi,auto and Bajaj class methods");
		
		bajaj baj = new bajaj();

		baj.sound();
		baj.brake();
		baj.entertainment();
		baj.specialFeature();
		baj.stability();
		baj.wheels();
		baj.engine();
		System.out.println();
		
		}

}
