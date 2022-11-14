package week3.assignement.day1;

public class Student extends Department {

	public String studentName() {

		String name = "Balakumar";
		return name;
	}

	public String studentDept() {

		String studentDeptName = "ECE";
		return studentDeptName;
	}

	public long studentId() {

		long studentid = 510814106005l;
		return studentid;
	}

	public static void main(String[] args) {

		Student s = new Student();
		
		System.out.println("Department name " + s.deptName()); 
		System.out.println("Name of the college is "+ s.collegeName());
		System.out.println("Code of the college is "+ s.collegeCode());
		System.out.println("Rank of the college is "+ s.collegeRank());
		System.out.println("Name of the student "+ s.studentName());
		System.out.println("Id of the student "+ s.studentId());
		System.out.println("Department of the student "+ s.studentDept());
		

	}

}
