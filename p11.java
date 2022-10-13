class p11
{
    int x,y;
    p11(int x)
    {
        this.x=x;
        System.out.println("x= "+x+" y= "+y);
    }
    p11(int x, int y)
    {
        this.x=x;
        this.y=y;
        System.out.println("x= "+x+" y= "+y);
    }  
    p11(p11 cp)
    {
        this.x=cp.x;
        this.y=cp.y;
        System.out.println("x= "+x+" y= "+y);
    }
    public static void main(String arg[])
    {
        p11 p1=new p11(5);
        p11 p2=new p11(5,10);
        p11 p3=new p11(p2);
    }
}