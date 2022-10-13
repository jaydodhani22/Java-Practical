class p14
{
    int no=10;
    void P_val(int no)
    {
        no=1;
    }
    void P_ref(p14 p)
    {
        no=2;
    }
    int R_val()
    {
        return no;
    }
    p14 R_obj()
    {
        p14 obj=new p14();
        obj.no=4;
        return obj;
    }
    public static void main(String arg[])
    {
        p14 p=new p14();
        p.P_val(20);
        System.out.println("PassByValue: "+p.no);
        p.P_ref(p);
        System.out.println("PassByReference: "+p.no);
        System.out.println("ReturningValue: "+p.R_val());
        p14 p1=p.R_obj();
        System.out.println("ReturningObject: "+p1.no);
    }
}