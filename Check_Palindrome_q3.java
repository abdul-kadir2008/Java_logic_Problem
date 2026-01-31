import java.util.Scanner;
class Check_Palindrome_q3 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int num= sc.nextInt();
		final int copy = num;
		int count = 0;
		while (num!=0)
		{
			count++;
			num/=10;
		}
		num=copy;
		int arr[]= new int[count];
		for (int i=0;i<=(count-1) ;i++ )
		{
			int temp = num%10;
			arr[i]=temp;
			num/=10;
		}
		IO.println("count"+count);
		int new_Number=0;
		for (int i=0;i<=(count-1) ;i++)
		{
			new_Number = new_Number *10+arr[i];
		}

IO.println("new_number : "+new_Number);		
IO.println("copy : "+copy);
		if (new_Number == copy)
		{
			IO.println("It's Palindrome Number : ");
		}
		else
		{
			IO.println("It's Not Palindrome Number : ");
		}
	}
}
