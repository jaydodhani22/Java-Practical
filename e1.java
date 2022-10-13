import java.util.Scanner;
class e1
{
    public static void main(String args[])
    {
        long n, m, r = 0, rm;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextLong();
        m = n;
        while (n != 0)
        {
            rm = n % 10;
            r = r * 10 + rm;
            n = n / 10;
        }
        if (m == r)
            System.out.println("Palindrome number");
        else
            System.out.println("Not palindrome");
    }
}