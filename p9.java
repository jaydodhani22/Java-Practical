class p9
{
    static
    {
        System.out.println("Static block executed");
    }
    public static void main(String args[])
    {
        p9 d=new p9();
        System.out.println("Main block executed");
        d.show();
    }
    void show()
    {
        System.out.println("Show method executed");
    }
}