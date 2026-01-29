class Count_Even_Odd_Number_q4 
{
	public static void main(String[] args) 
	{
		int num =Integer.parseInt(IO.readln("Enter Your Number : "));
		int num_Even=0;
		int num_Odd=0;
		while(num!=0)
		{
			int temp = num%10;
			if (temp%2==0 )
			{
				if(temp!=0)
				{
					num_Even++;
				}
				
			}
			else
			{
				num_Odd++;
			}
			num/=10;
		}
			IO.println("Total Even Digit in  Your Number : "+num_Even);
			IO.println("Total  Odd Digit in  Your Number : "+num_Odd);
	}
}
