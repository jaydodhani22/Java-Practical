abstract class Shape
{
	double area;
	abstract void area();
}
class Triangle extends Shape
{
	void area()
	{
		int b = 10, h = 20;
		area = (b * h) / 2;
		System.out.println("Area of Triangle is= " + area);
	}
}
class Rectangle extends Shape
{
	void area()
	{
		int l = 10, b = 20;
		area = l * b;
		System.out.println("Area of Rectangle is= " + area);
	}
}
class Circle extends Shape
{
	void area()
	{
		int r = 10;
		area = 3.14 * r * r;
		System.out.println("Area of Circle is= " + area);
	}
}
class p21
{
	public static void main(String arg[])
	{
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Shape s;
		s = t;
		s.area();
		s = r;
		s.area();
		s = c;
		s.area();
	}
}