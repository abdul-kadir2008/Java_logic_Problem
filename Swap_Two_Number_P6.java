class Swap_Two_Number_P6
{
	public static void main(String[] args) 
	{  
		int temp=0;
	    int x=Integer.parseInt(IO.readln("Enter First Number: "));
	    int y=Integer.parseInt(IO.readln("Enter First Number: "));
		IO.println("Before sawp Number First is "+x);
		IO.println("Before sawp Number Second is "+y);
		temp = x;
		x = y;
		y =temp;
		IO.println("After sawp Number First is "+x);
		IO.println("After sawp Number Second is "+y);
		
	}
}
