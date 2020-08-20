class CommandLine
{
	public static void main(String args[])
	{
		int i,n=args.length;
		
		if(n==0)
		{
			System.out.println("No arguments passed");
		}
		else
		{
			for(i=0;i<n;i++)
			{
				System.out.print(args[i]+" ");
			}
		}
		System.out.println();
		System.out.println("there Are "+ n +" arguments passed: ");
		System.out.println("this is the Value of zeros index: "+args[0]);
	}
}