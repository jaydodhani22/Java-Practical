import java.util.Scanner;
class p3
{
	public static void main(String arg[])
	{
		int a, b, c, n, m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  three numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		n = a > b ? a : b;
		m = n > c ? n : c;
		System.out.println("Maximum= " + m);
	}
}