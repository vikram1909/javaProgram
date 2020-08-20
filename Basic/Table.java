import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:" );
		int n=s.nextInt();
		for(int i=1;i<=10;i++) 
		{
			int f=i*n;
			System.out.println(n+" * "+i+" = "+f);
		}
	}
}