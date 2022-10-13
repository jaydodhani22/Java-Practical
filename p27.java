class One extends Thread
{
    One(String s)
    {
        super(s);
    }
    public void run()
    {
        System.out.println("Thread " + Thread.currentThread().getName());
        try
        {
            Thread.sleep(2000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class Two extends Thread
{
    Two(String s)
    {
        super(s);
    }
    public void run()
    {
        System.out.println("Thread " + Thread.currentThread().getName());
        try
        {
            Thread.sleep(4000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class p27
{
    public static void main(String args[])
    {
        One o1 = new One("One");
        Two t1 = new Two("Two");
        o1.start();
        t1.start();
    }
}