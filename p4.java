import java.util.Scanner;
class p4
{
    public static void main(String args[])
    {
        int l, num, max = 0, smax = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        l = sc.nextInt();
        System.out.println("Enter " + l + " numbers:");
        while (l > 0)
        {
            num = sc.nextInt();
            if (num > max)
            {
                smax = max;
                max = num;
            }
            else if (num > smax && num < max)
            {
                smax = num;
            }
            l--;
        }
        System.out.println("Second max= " + smax);
    }
}