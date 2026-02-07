class CheckDackNumber 
{
	public static boolean getDackNumber(int num)
	{
		while (num!=0)
		{ int temp = num%10;
			if (temp==0)
			{
				return true;
			}
			num/=10;
		}
		return false;
	}
}


public class Main_Dack_Number
{
	public static void main()
	{
		int number= Integer.parseInt(IO.readln("Enter your Number :"));
		boolean n = CheckDackNumber.getDackNumber(number);
		if (n)
		{
			IO.println(number+" is a Duck Number :");
		}
		else
		{
			IO.println(number+" is Not Duck Number :");
		}
	}
}


