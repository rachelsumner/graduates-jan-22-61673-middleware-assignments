package assignments;

public class Q3 {
	public String getGrade(int marks1, int marks2, int marks3) {
		double average = (marks1+marks2+marks3)/3;
		String grade = "FAIL";
		if(average >= 90) {
			grade = "A+";
		} else if (average >= 80) {
			grade = "A";
		} else if (average >= 70) {
			grade = "A-";
		} else if (average >= 60) {
			grade = "B+";
		} else if (average >= 50) {
			grade = "B";
		}
		return grade;
	}
}
