package week3.assignement.day1;

public class Students {

	public void getStudentInfo(int id) {

		System.out.println("student id --> " + id);

	}

	public void getStudentInfo(int id, String name) {

		System.out.println("student id & Name --> " + id + " and " + name);

	}

	public void getStudentInfo(String email, int phonenumber) {

		System.out.println("student mail & Contact --> " + email + " and " + phonenumber);

	}

	public static void main(String[] args) {

		Students s = new Students();

		s.getStudentInfo(54321);
		s.getStudentInfo(54321, "Bala");
		s.getStudentInfo("bala@gmail.com", 5414562);

	}

}
