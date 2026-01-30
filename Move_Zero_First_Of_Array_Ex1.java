import java.util.Scanner;
class Move_Zero_First_Of_Array_Ex1 
{
	public static void main(String[] args) 
	{
		Scanner sc  =  new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int num = sc.nextInt();
		final int copy=num;
		int new_Number=0;
		int zero_Count=0;
		int digit_Count=0;
		int temp=0;
		int total_Count=0;
		//finding digit;
		while (num!=0)
		{
			temp=num%10;
			if(temp==0)
			{
				zero_Count++;
			}
			else
			{
				digit_Count++;
			}
			num/=10;
		}
		num=copy;
		total_Count=zero_Count+digit_Count;
		int arr[] = new int[total_Count];
		//Number store in array;
		for (int i =(total_Count-1);i>=0 ;i-- )
		{
			arr[i]=num%10;
			num/=10;
		}
		//new Number Store;
		for (int i=0;i<total_Count ;i++ )
		{
			if (arr[i]!=0)
			{
				new_Number=new_Number*10+arr[i];
			}
		}
		
		String result="0";
		for(int i=1;i<=zero_Count-1;i++)
		{
			result =result +"0";
		}
		System.out.println("New Number :"+ result+new_Number);
	}
}
