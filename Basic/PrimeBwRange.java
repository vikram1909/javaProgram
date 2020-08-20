import java.util.*;
class PrimeBwRange
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Starting number: ");
		int n=sc.nextInt();
		System.out.print("Enter ending Number: ");
		int m=sc.nextInt();
		for(int i=n;i<=m;i++)
		{
			int f=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					f=1;
					break;
				}
			}
			if(f!=1)
			System.out.println("\n"+i);
		}
	}
}
