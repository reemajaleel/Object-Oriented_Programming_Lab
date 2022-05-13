/*
Create an interface having prototypes of functions area() and perimeter().
Create two classes Circle and Rectangle which implements the above interface.
Create a menu driven program to find area and perimeter of objects.
*/




import java.util.*;

interface AP
{
	void input();
	void area();
	void perimeter();
}


class Circle implements AP
{
	Scanner sc=new Scanner(System.in);
	double r,area,perimeter;
	double pi=3.14;

	public void input()
	{
		System.out.print("\nEnter Radius : ");
		this.r=sc.nextInt();
	}

	public void area()
	{
		area=pi*r*r;
		System.out.println("Area = "+area);
	}

	public void perimeter()
	{
		perimeter=2*pi*r;
		System.out.println("Perimeter = "+perimeter);
	}
}


class Rectangle implements AP
{
	Scanner sc=new Scanner(System.in);
	double l,b,area,perimeter;

	public void input()
	{
		System.out.print("\nEnter Length and Breadth : ");
		l=sc.nextInt();
		b=sc.nextInt();
	}

	public void area()
	{
		area=l*b;
		System.out.println("Area = "+area);
	}

	public void perimeter()
	{
		perimeter=2*(l+b);
		System.out.println("Perimeter = "+perimeter);
	}
}


class IFaceDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		Rectangle r= new Rectangle();

		do
		{
			System.out.println("\n1.Circle\n2.Rectangle\n3.Exit");
			System.out.print("Enter your choice : ");
			int ch =sc.nextInt();

			switch(ch)
			{
				case 1: c.input();
					c.area();
					c.perimeter();
					System.out.println("-------------------------");
					break;

				case 2: r.input();
					r.area();
					r.perimeter();
					System.out.println("-------------------------");
					break;
 
				default:System.out.println("Exiting.....");
					System.exit(0);
					break;
			}
		}
		while(true);
	}
}



/*
OUTPUT:

1.Circle
2.Rectangle
3.Exit
Enter your choice : 1

Enter Radius : 2
Area = 12.56
Perimeter = 12.56
-------------------------

1.Circle
2.Rectangle
3.Exit
Enter your choice : 2

Enter Length and Breadth : 2
4
Area = 8.0
Perimeter = 12.0
-------------------------

1.Circle
2.Rectangle
3.Exit
Enter your choice : 3
Exiting.....
*/
