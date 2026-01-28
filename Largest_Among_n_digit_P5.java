class Largest_Among_n_digit_P5
{
	public static void main(String[] args) 
	{
		int largeNumber=0;
       int n =Integer.parseInt(IO.readln("Enter how many Number for  check large number:"));
	   int arr[]=new int[n];
	   for( int i=0;i<n;i++)
		{
			 arr[i] = Integer.parseInt(IO.readln( "Enter Number "+(i+1)+" :"));
		}
		for (int  i=0;i<n ;i++ )
		{
			if (largeNumber <  arr[i])
			{
				largeNumber=arr[i];
			}
		}
		IO.println("Large Number is "+largeNumber +":");
	   }
}
