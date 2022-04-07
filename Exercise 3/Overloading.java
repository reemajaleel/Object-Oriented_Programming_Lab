//Find the area of different shapes using overloaded functions



import java.util.*;

class OverLoadArea{

		void area(int a){    //Method for area of square
			System.out.println("Area of Square: "+a*a);	
		}
		void area(int a,int b){	//Method for area of rectangle
			System.out.println("Area of Rectangle: "+a*b);	
		}
		void area(double r){	//Method for area of circle
			System.out.println("Area of Circle: "+3.14*r*r);	
		}
	}
			
class Overloading{
	public static void main(String args[]){	//main method
	
			Scanner sc=new Scanner(System.in);		 //scanner object
			OverLoadArea o=new OverLoadArea();		 //object of class OverLoadArea
			
			System.out.println("1.Square\n2.Rectangle\n3.Circle");
			System.out.print("Enter your option: ");
			int opt = sc.nextInt();
			System.out.println("---------------------------------");
			switch(opt){
				case 1: System.out.println("Square");
					    System.out.print("Enter the side of square: ");
					    int side = sc.nextInt();
					    o.area(side);
					    break;
				case 2: System.out.println("Rectangle");
					    System.out.print("Enter length: ");
					    int len = sc.nextInt();
					    System.out.print("Enter breadth:");
					    int brd = sc.nextInt();
					    o.area(len,brd);
					    break;
				case 3: System.out.println("Circle");
					    System.out.print("Enter Radius: ");
					    double r = sc.nextDouble();
					    o.area(r);
					    break;
					   
			
			
			
			}
			
			
	}


}

/*
OUTPUT:

1.Square
2.Rectangle
3.Circle
Enter your option: 1
---------------------------------
Square
Enter the side of square: 2
Area of Square: 4






1.Square
2.Rectangle
3.Circle
Enter your option: 2
---------------------------------
Rectangle
Enter length: 2
Enter breadth:4
Area of Rectangle: 8






1.Square
2.Rectangle
3.Circle
Enter your option: 3
---------------------------------
Circle
Enter Radius: 2
Area of Circle: 12.56
*/
//Verified
