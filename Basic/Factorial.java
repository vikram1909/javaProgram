import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:" );
		int n=s.nextInt();
		int m=n,f=1;
		while(n>0)
		{
			f=f*n;
			n--;
		}
		System.out.print("Factorial of "+m+" is "+f);
	}
}