class e4
{
    void add(int a)
    {
        System.out.println("a= "+a);
    }
    void add(int a, int b)
    {
        int c=a+b;
        System.out.println("c= "+c);
    }
    void add(int a, int b, int c)
    {
        int d=a+b+c;
        System.out.println("d= "+d);
    }
    public static void main(String args[])
    {
        e4 e=new e4();
        e.add(5);
        e.add(2,3,5);
        e.add(2,5);
    }
}