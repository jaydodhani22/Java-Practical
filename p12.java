class p12
{
    int a,b;
    static int count;
    private p12()   // private default
    {
        count++;
    }
    void print()
    {
        System.out.println(count);
    }
    public static void main(String arg[])
    {
        p12 p1=new p12();
        p12 p2=new p12();
        p12 p3=new p12();
        p12 p4=new p12();
        p1.print();
    }
}