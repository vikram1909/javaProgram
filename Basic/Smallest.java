import java.util.Scanner;
class Smallest
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st value:" );
		int a=s.nextInt();
		System.out.print("Enter 2nd value: ");
		int b=s.nextInt();
		System.out.print("Enter 3rd value: ");
		int c=s.nextInt();
		if(a<b && a<c)
			System.out.println(a + " Is Smallest number:");
		else if(b<c)
			System.out.println(b + " Is Smallest number:");
		else
			System.out.println(c + " Is Smallest number:");
	}
}