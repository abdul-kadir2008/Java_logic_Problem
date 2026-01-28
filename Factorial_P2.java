class Factorial_P2
{
	public static void main(String[] args) 
	{
		int Num= Integer.parseInt(IO.readln("Enter Your Number for finidng Factorial:"));
		int factorial=1;
		for ( int i=Num;i>=2 ;i-=2 )
		{
			factorial=i*(i-1)*factorial;
		}
		IO.println(factorial);
	}
}
