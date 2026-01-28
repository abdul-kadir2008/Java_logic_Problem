class Even_Or_Odd_p1 
{
	public static void main(String[] args) 
	{
		int Num= Integer.parseInt(IO.readln("Enter YOur number :"));
		
		if(Num%2==0)
		{
			IO.println(Num + " is Even Number:");
		}
		else
		{
			IO.println(Num+" is Odd Number:");
		}
	}
}
