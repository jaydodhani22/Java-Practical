class Line
{
    synchronized public void getLine()
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class Train extends Thread
{
    Line line;
    Train(Line line)
    {
        this.line = line;
    }
    public void run()
    {
        line.getLine();
    }
}
class p29
{
    public static void main(String args[])
    {
        Line t = new Line();
        Train t1 = new Train(t);
        Train t2 = new Train(t);
        t1.start();
        t2.start();
    }
}