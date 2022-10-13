interface P1
{
    final int p1=1;
    void dispP1();
}
interface P2
{
    final int p2=2;
    void dispP2();
}
interface P12 extends P1,P2
{
    final int p12=12;
    void dispP12();
}
class Q implements P12
{
    public void dispP1()
    {
        System.out.println("dispP1 : "+p1);
    }
    public void dispP2()
    {
        System.out.println("dispP2 : "+p2);
    }
    public void dispP12()
    {
        System.out.println("dispP12 : "+p12);
    }  
}
class p19
{
    public static void main(String arg[])
    {
        Q q=new Q();
        q.dispP1();
        q.dispP2();
        q.dispP12();
    }
}