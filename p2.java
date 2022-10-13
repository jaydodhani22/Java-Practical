import java.util.Scanner;
class p2
{
	public static void main(String args[])
	{
		int i, j, a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		System.out.println("Prime numbers: ");
		for (i = 1; i <= n; i++)
		{
			a = 0;
			for (j = 1; j <= i; j++)
			{
				if (i % j == 0)
				{
					a++;
				}
			}
			if (a == 2)
			{
				System.out.println(i);
			}
		}
	}
}