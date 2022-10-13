import java.util.Scanner;
class p6
{
    public static void main(String args[])
    {
        int i, f = 1, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++)
        {
            f = f * i;
        }
        System.out.println("Factorial of " + n + " is: " + f);
    }
}