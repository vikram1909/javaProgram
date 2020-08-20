import java.util.*;
class ReverseNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter Any number: ");
		int n=sc.nextInt();
		int m=n,count=0;
		while(n>0)
		{
			int r=n%10;
		    count=count+1;
			n=n/10;
		}
		System.out.println("\n" + m + " has " + count + " digits");
	}
}