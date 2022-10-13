class p24
{
	public static void main(String args[])
	{
		int a=0,b=10,c;
		try
		{	
			c=b/a;
			System.out.println("c="+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of code...");
	}
}