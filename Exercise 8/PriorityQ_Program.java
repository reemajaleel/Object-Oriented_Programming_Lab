//Program to demonstrate the creation of queue object using the PriorityQueue class


import java.util.*;

public class PriorityQ_Program
{
	public static void main(String args[])
	{

		PriorityQueue<String> queue=new PriorityQueue<String>();

		queue.add("Aneetha");
		queue.add("Ambili");
		queue.add("Fathima");
		queue.add("Naseera");
		System.out.println("Elements in Priority Queue : "+queue);
		
	}
}

/*
OUTPUT:

Elements in Priority Queue : [Ambili, Aneetha, Fathima, Naseera]
*/
