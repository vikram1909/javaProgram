import java.util.*;
class ReverseString
{
	public static void main(String args[])
	{
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Sentence:");
		String s=sc.nextLine();
		for(int n=s.length()-1;n>=0;n--)
		{
			rev=rev+s.charAt(n);
		}
		System.out.println(rev);
	}
}