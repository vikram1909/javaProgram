import java.util.*;
class HcfByLogic
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int n=sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int m=sc.nextInt();
		int st=0,gt=0,rem=0;
		if(n!=0 && m!=0)
		{
			if(n>=m)
			{
			    st=m;
			    gt=n;
			}
			else
			{
			    st=n;
			    gt=m;
			}
			if(st!=gt)
			{
				while(st>0)
				{
				    rem=gt%st;
					gt=st;
					st=rem;
				}
				System.out.print("HCF: "+gt);
			}
			else
				System.out.print("HCF: "+gt);
		}
		else if(n==0 && m==0)
			System.out.print("Both numbers are zero, HCF cant Possible: ");
		else if(n==0)
			System.out.print("One of number is Zero,HCF cant Possible:  ");
		else
			System.out.print("One of number is Zero,HCF cant Possible:  ");
	}
}

		