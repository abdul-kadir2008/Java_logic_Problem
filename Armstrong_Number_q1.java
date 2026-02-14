import java.util.Scanner;
class Armstrong_Number_q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number ");
		int num = sc.nextInt();
		int copy =num;
		int count = 0;
		//find how many digit in our Number..
	     while (num%10!=0)
	     { 
			 count++;
			 num/=10;
	     }
		 num=copy;
		 int new_Number=1;
		 int total_Number=0;
		 while(num%10!=0)
		 {
			 new_Number=  1; 
			 int temp = num%10;
			for (int i=1;i<=count;i++)
			{
				new_Number=temp*new_Number;
			}
			total_Number+=new_Number;
			num/=10;
		 }
			 
		 if(copy==total_Number)
		{
			System.out.println("It's Armstrong Number : ");
		}
		else
		{
			System.out.println("It's not Armstrong Number : ");
		}
	}
}

