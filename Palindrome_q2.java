class Palindrome_q2 
{
	public static void main(String[] args) 
	{
	2int num = Integer.parseInt(IO.readln("Enter Your Number : "));
	int count=0;
	int temp=num;
	while (num!=0)
	{
		int temp_1= num%10;
		
		count++;
		num/=10;
	}
	
	int rev=0;
	num=temp;
	for (int i=0;i<count ;i++ )
	{
		int temp_2=num%10;
		rev=rev*10+temp_2;
		num=num/10;
	}
	IO.println("reverse"+rev);
	if(rev==temp)
		{
		IO.println("ITs Number is Palidrom :");
		}
		
	else
		{
		IO.println("ITs Number is not Palidrom :");	
		}
	}	
	}

