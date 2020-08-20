import java.util.*;
class ReverseNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any number: ");
		int n=sc.nextInt();
		int m=n,rev=0;
		while(n>0)
		{
			int r=n%10;
		    rev=rev*10+r;
			n=n/10;
		}
		System.out.print("Reverse of " + m + " is: " + rev);
	}
}