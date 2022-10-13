class Invalid extends Exception
{
    Invalid(String s)
    {
        super(s);
    }
}
class p26 
{
    static double dep = 1000.00;
    static void withdraw(double amt) throws Invalid
    {
        if (dep < amt)
            throw new Invalid("Not Sufficient Fund");
        else
        {
            dep = dep - amt;
            System.out.println("Available fund= " + dep);
        }
    }
    public static void main(String arg[])
    {
        try
        {
            withdraw(400.00);
            withdraw(300.00);
            withdraw(500.00);
        }
        catch (Exception m)
        {
            System.out.println(m);
        }
    }
}