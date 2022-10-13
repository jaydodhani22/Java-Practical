class p10
{
    int x=10;
    void print(int x)
    {
        System.out.println("Instance variable= "+this.x);
        System.out.println("Local variable= "+x);
    }
    void show()
    {
        int x=50;
        System.out.println("Instance variable= "+this.x);
        System.out.println("Local variable= "+x);
    }
    public static void main(String args[])
    {
        p10 d1=new p10();
        p10 d2=new p10();
        d1.print(20);
        d2.show();
    }
}