package assignments;

public class Q4 {

	public int findLuckyNumber(int num) {
		int sum = 0;
		int digit = 0;
		while (num > 0) {
			digit = num % 10;
			sum += digit;
			num = num/10;
		}
		if (sum > 10) {
			sum = findLuckyNumber(sum);
		}
		return sum;
	}
}
