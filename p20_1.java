package pack;
import mypack.*;
class A extends p20
{
	public void print()
	{
		System.out.println("A class");
	}
}
class p20_1
{
	public static void main(String args[])
	{
		A a = new A();
		a.print();
		p20 p = new p20();
		p.print();
	}
}
// javac -d . p20_1.java
// java pack.p20_1

// javac p20_1.java
// java p20_1