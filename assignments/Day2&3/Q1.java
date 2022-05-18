package assignments;

public class Q1 {

	public int q1(int num1, int num2, int num3) {
		int smallestNum = num1;
		int[] numArray = {num2, num3};
		for(int num : numArray) {
			if(num < smallestNum) {
				smallestNum=num1;
			}
		}
		return smallestNum;
	}
}
