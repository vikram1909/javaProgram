import java.util.Scanner;
class CheckPrime
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:" );
		int n=s.nextInt();
		int f=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				f=1;
				break;
			}
		}
		if(f!=1)
			System.out.print(n+" is prime number");
		else
			System.out.print(n+" is not prime number");
	}
}