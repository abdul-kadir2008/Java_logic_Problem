class Swap_Number_q1 
{
	public static void main(String[] args) 
	{
		int x =5;
		int y=7; 
		IO.println("Before Sawping :");
		IO.println("value of x="+x);
		IO.println("value of y ="+y);
		x=y-x; //2
		y= y-x; // 5
		x=y+x;//7
		IO.println("After Sawping :");
		IO.println("value of x="+x);
		IO.println("value of y ="+y);
	}
}
