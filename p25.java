class p25
{
	public static void main(String args[])
	{	
		int a=0,b=10,c;
		try
		{
			c=b/a;
			System.out.println("c="+c);
			try
			{
				int x[]=new int[5];
				x[10]=10;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("/ by zero");
		}
		System.out.println("Rest of code...");
	}
}