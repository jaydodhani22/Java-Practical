import java.util.Scanner;
class e2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = 5, temp, i, j;
        int a[] = new int[n];
        System.out.println("Enter elements:");
        for (i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++)
        {
            for (j = i + 1; j < n; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Descending Order:");
        for (i = 0; i < n; i++)
        {
            System.out.println(a[i]);
        }
    }
}