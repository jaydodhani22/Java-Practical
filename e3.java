class e3
{
    public static void main(String args[])
    {
        StringBuffer str1 = new StringBuffer("CEDT");
        StringBuffer str2 = new StringBuffer(100);
        System.out.println("str1= "+str1);
        System.out.println("str1 capacity= "+str1.capacity());
        System.out.println("str2 capacity= "+str2.capacity());
        System.out.println("CharAt 2= "+str1.charAt(2));
        System.out.println("str1 reverse= "+str1.reverse());
        str1.append("Sem5");
        str1.insert(4,"College");
        System.out.println(str1);
        // System.out.println(str2);
    }
}