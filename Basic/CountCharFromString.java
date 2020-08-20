import java.util.*;
class CountCharFromString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Sentence:");
		String s=sc.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
				c++;
		}
		System.out.println("no of char is "+c);
	}
}