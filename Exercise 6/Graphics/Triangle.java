package Graphics;
import java.util.*;

interface Area2
{
	void area();
}

public class Triangle implements Area2
{
	int s1=5;
	int s2=4;
	int s3=6;
    
	public void area()
	{
		float s=(s1+s2+s3)/2;
		double ar=Math.sqrt((s-s1)+(s-s2)+(s-s3));
		System.out.println("Area of Triangle : "+ar);
	}
}
