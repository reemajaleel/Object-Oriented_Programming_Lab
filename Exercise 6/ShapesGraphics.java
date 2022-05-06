/*
Create a Graphics package that has classes and interfaces for figures Rectangle, Triangle, Square and Circle.
Test the package by finding the area of these figures.
*/



import Graphics.*;



class ShapesGraphics
{
	public static void main(String args[])
	{
		Circle obj = new Circle();
		Square obj1 = new Square(); 
		Rectangle obj2 = new Rectangle();
		Triangle obj3 = new Triangle();

		obj.area();
		obj1.area();
		obj2.area();
		obj3.area();
	}
}




/*
OUTPUT:

Area of circle : 78.5
Area of square : 25
Area of rectangle : 20
Area of Triangle : 3.3166247903554
*/
