class AtmSystem 
{
	public static void main(String[] args) 
	{
		int com_Pass=4444;
		int try_Pass ;
		int count=0;
		for (int i=1;i<=3 ;i++ )
		{
			try_Pass = Integer.parseInt(IO.readln("Enter Your Password : "));
			if (com_Pass==try_Pass)
			{
				IO.println("..........Wellcome to SBI Bank.......");
				IO.println("You are try "+i+" times ");
				System.exit(0);
			}
			IO.println("Worng Password Try Again....");
		} 
		IO.println("Your Password is worng So Your ATM is LOCKED for 24 Hours...");
	}
}
