interface P22_1
{
    public void display();
}
interface P22_2
{
    public void print();
}
class P22_3 implements P22_1, P22_2
{
    public void display()
    {
        System.out.println("Display method");
    }
    public void print()
    {
        System.out.println("Print method");
    }
}
class p22
{
    public static void main(String args[])
    {
        P22_3 p = new P22_3();
        p.display();
        p.print();
    }
}