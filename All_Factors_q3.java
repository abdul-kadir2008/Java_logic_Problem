import java.util.Scanner;
class All_Factors_q3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int num = sc.nextInt();
		System.out.println("All factors of Number "+num+" : ");
		for (int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
