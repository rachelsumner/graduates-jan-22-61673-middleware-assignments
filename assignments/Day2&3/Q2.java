package assignments;

public class Q2 {
	int studentId;
	String studentName;
	int studentAge;
	int marks1;
	int marks2;
	int marks3;
	
	public Q2(int studentId, String studentName, int studentAge, int marks1, int marks2, int marks3) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	
	public double calculateTotal() {
		return (this.marks1 + this.marks2 + this.marks3)/3;
	}
	
	public void displayResult() {
		if(this.calculateTotal() > 50) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}
}
