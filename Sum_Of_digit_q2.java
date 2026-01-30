import java.util.Scanner;

class Sum_Of_digit_q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int num = sc.nextInt();
		int sum = num;
		while (num >= 9) {
			int temp = 0;
			sum = 0;
			while (num > 0) {
				temp = num % 10;
				sum = sum + temp;
				num /= 10;
			}
			num = sum;
		}
		IO.println(sum);
	}
}
