package Graphics;
import java.util.*;

interface Area
{
	void area();
}

public class Rectangle implements Area
{
	int l=5;
	int b=4; 
      
	public void area()
	{
		int ar=l*b;
		System.out.println("Area of rectangle : "+ar);
	}
}
