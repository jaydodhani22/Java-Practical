import java.util.Scanner;
class p16_1
{
    int year;
    void get()
    {
        System.out.print("Enter year: ");
        Scanner sc = new Scanner(System.in);
        year=sc.nextInt();
    }
    void check()
    /*  %4: every normal 4th year is leap year;
        %100: every century year is not leap year;
        %400: every century 4th year is leap year;  */
    {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year");
    }
}
class p16 extends p16_1
{
    public static void main(String args[])
    {
        p16 p=new p16();
        p.get();
        p.check();
    }
}