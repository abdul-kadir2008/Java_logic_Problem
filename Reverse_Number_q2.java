import java.util.Scanner;
class Reverse_Number_q2 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int num = sc.nextInt();
		final int copy =num;
		int count =0;
		int arr[] = new int[num];
		while (num!=0)
		{ 
			count++;
			num/=10;
		}
		num=copy;
		for (int i=0;i<num ;i++ )
		{
			int temp=num%10;
			arr[i]=temp;
			num/=10;
			
		}
		IO.println("count "+count);
		int rev_Number=0;
		for (int i=0;i<=(count-1);i++)
		{
			rev_Number =rev_Number*10+arr[i];
		}
		System.out.println("Reverse Number is : " + rev_Number);
		
	}
}
