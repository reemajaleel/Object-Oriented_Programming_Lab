package Graphics;
import java.util.*;

interface Area3
{
	void area();
}
public class Circle implements Area3
{
	int r=5;
	double pi=3.14, ar=0;
      
	public void area()
	{
		ar=pi*r*r;
		System.out.println("Area of circle : "+ar);
	}
}
