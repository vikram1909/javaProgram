import java.util.*;
class Squreroot
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Number: ");
		int n=sc.nextInt();
		System.out.print("Enter 2nd Number: ");
		int m=sc.nextInt();
		if(n>m)
		{
			int sq=n*n;
			System.out.println("Square of "+n+"is: "+sq);
			double root=Math.sqrt(m);
			System.out.println("Square root of "+m+"is: "+root);
		}
		else
		{
			int sq=m*m;
			System.out.println("Square of "+m+"is: "+sq);
			double root=Math.sqrt(n);
			System.out.println("Square root of "+n+"is: "+root);
		}
	}
}