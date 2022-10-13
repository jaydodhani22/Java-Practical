class p15_1
{
    void Shape()
    {
        System.out.println("Shape name: ");
    }
}
class p15_2 extends p15_1
{
    void cir()
    {
        System.out.println("Circle");
    }
}
class p15_3 extends p15_1
{
    void rec()
    {
        System.out.println("Rectangle");
    }
}
class p15 extends p15_3
{
    void squ()
    {
        System.out.println("Square");
    }
    public static void main(String args[])
    {
        System.out.println("\nSingle=== ");
        p15_2 p=new p15_2();
        p.Shape();
        p.cir();
        System.out.println("\nMultilevel=== ");
        p15 p1=new p15();
        p1.Shape();
        p1.rec();
        p1.squ();
        System.out.println("\nHierachical=== ");
        p15_2 p2=new p15_2();
        p2.Shape();
        p2.cir();
        p15_3 p3=new p15_3();
        p3.Shape();
        p3.rec();
    }
}