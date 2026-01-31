import java.util.Scanner;
class Check_Prime_Or_Not_q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Number :");
	 int num = sc.nextInt();
	 for (int i=2;i<num ;i++ )
	 {
		 if(num%i==0)
		 {
			System.out.println("it's  not a Prime Number :");
			System.exit(0);
		 }
		 
	 }
	 System.out.println("it's  a Prime Number :");
	}
	
}