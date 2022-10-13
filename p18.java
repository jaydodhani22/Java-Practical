class Super
{
    Super(int a)
    {
        System.out.println("Super Class : " +a);
    }
}
class Sub extends Super
{
    Sub(int b,int c)
    {
        super(b);
        System.out.println("Sub class : "+c);
    }
}
class p18
{
    public static void main(String arg[])
    {
        Sub s=new Sub(5,4);
    }
}