package week3.day1;

public class HousingPlan implements Plan {

	//abstract method no need implementation if abstract method present in a class then the class should be abstract class only.
	//if a class is abstract class then it should have atleast one abstarct method.
	//U cannot create a object for Abstract class
	//public abstract void borewell();

	
	public void borewell() {
		// TODO Auto-generated method stub
		
	}

	public void poojaRoom() {
		// TODO Auto-generated method stub
		
	}

	public void playArea() {

		System.out.println("Playarea built for childrens to play");

	}

	// below method available in this class and not in interface

	public void myHouseName() {
		System.out.println("Bala Palace");
	}

	public static void main(String[] args) {

		Plan h = new HousingPlan();
		h.borewell();
		h.poojaRoom();
		h.playArea();
		// u can call the method which is additionally methods present in class
		// h.myHouseName();
		/*
		 * if u want to restrict and strictly into Interface method alone then use Scope
		 * Restriction in creating object like Plan h=new HousingPlan();
		 */

	}


	

}
