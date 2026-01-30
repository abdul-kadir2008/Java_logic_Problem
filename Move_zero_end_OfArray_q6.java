import java.util.Scanner;

class Move_zero_end_OfArray_q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your number :");
		int num = sc.nextInt();
		final int copy = num;
		int arr[] = new int[num];
		int digit_Count = 0;
		int zero_Count = 0;
		int new_Number = 0;
		int temp = 0;
		while (num != 0) {
			temp = num % 10;
			if (temp == 0) {
				zero_Count++;
			} else {
				digit_Count++;
			}
			num /= 10;
		}
		num = copy;
		int total_Count = zero_Count + digit_Count;
		// Store Number in array:
		for (int i = (total_Count - 1); i >= 0; i--) {
			arr[i] = num % 10;
			num /= 10;
		}
		// New Number store in new_Number :
		for (int i = 0; i <= (total_Count - 1); i++) {
			if (arr[i] != 0) {
				new_Number = new_Number * 10 + arr[i];

			}
		}
		for (int i = 0; i < 5; i++) 
			{
			System.out.println(arr[i]);
		    }

		for (int i=1;i<=zero_Count;i++ )
		{
			new_Number=new_Number*10;
		}
		System.out.println("new_Number " + new_Number);
		
	}

}
