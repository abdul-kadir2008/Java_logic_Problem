import java.util.Scanner;
class Perfect_squre_q1 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter You Number : ");
		int num =sc.nextInt();
		for (int i=1;i<=num/2 ;i++ )
		{
			int temp=i*i;
			if(temp==num)
			{
				System.out.println("Perfect squre : ");
			}
			
		}
	}
}
