 class IsPrime
{
	 public static boolean getPrime(int num)//7
	{
		 if (num<=1)
		 {
			 return false;
		 }
		else
		{
			
		for (int i=2;i<=num/2 ;i++ )//i=2
		{                            //num=7
			if (num%i==0)
			{
				return false;
			}
		}
		}
	return true;
	}
}


public class CheckItsPrimeNumber 
{
	void main()

	{
		int number = Integer.parseInt(IO.readln("Enter Your number :"));
		boolean n= IsPrime.getPrime(number);
		if (n)
		{
			IO.println(number+" is a Prime Number :");
		}
		else
		{
			IO.println(number+" is Not a Prime Number :");
		}
	}
}
