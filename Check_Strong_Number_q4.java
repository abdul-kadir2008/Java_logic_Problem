import java.util.Scanner;
class Check_Strong_Number_q4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num = sc.nextInt();
		final int copy=num;
		int temp_1=0;
		int sum=0;
		while (num!=0)
		{
			
			temp_1=num%10;
			
			while (temp_1>1)
			{
				int temp_2=0;
				temp_2=temp_1*(temp_1-1);
				temp_1-=2;
				sum=sum+temp_2;
			}
			
			num/=10;
			
		}
		System.out.println("sum"+sum);
			System.out.println("copy"+copy);
		if (copy == sum)
		{
			System.out.println("Strong Number : ");
		}
		else
		{
			System.out.println(" Not Strong Number : ");
		}
		
	}
}
