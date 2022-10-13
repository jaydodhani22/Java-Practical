import java.util.Scanner;
class p5
{
    public static void main(String args[])
    {
        long n, r = 0, rm;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextLong();
        while (n != 0)
        {
            rm = n % 10;
            r = r * 10 + rm;
            n = n / 10;
        }
        System.out.println("Reverse number: " + r);
    }
}