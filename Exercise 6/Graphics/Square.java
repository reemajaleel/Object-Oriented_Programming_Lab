package Graphics;
import java.util.*;

interface Area1
{
	void area();
}

public class Square implements Area1
{
	int s=5;

	public void area()
	{
		int ar=s*s;
		System.out.println("Area of square : "+ar);
	}
}
