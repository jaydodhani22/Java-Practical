class p17_A
{
    static int a;
}
class p17_B extends p17_A
{
    int a;
    void display()
    {
        System.out.println("Static a: " + super.a);
        System.out.println("Normal a: " + a);
    }
    public static void main(String arg[])
    {
        p17_A a = new p17_A();
        p17_B b = new p17_B();
        a.a = 10;
        b.a = 20;
        b.display();
    }
}