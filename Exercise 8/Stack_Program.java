//Program to remove an object from the Stack when the position is passed as parameter (removeElementAt())

import java.util.*;

public class Stack_Program
{
	public static void main(String args[])
	{

		Stack<String> stack = new Stack<String>();

		stack.push("Anjana");
		stack.push("Geethu");
		stack.push("Ayan");
		stack.push("Sithara");
		stack.push("Sanvika");
		stack.push("Jagan");

		System.out.println("Stack before removing index position : ");
		Iterator<String> it=stack.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		stack.removeElementAt(1);

		System.out.println("-------------------------------------------");

		System.out.println("Stack after removing index position 1 : ");
		Iterator<String> itr=stack.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	} 
}

/*
OUTPUT:

Stack before removing index position : 
Anjana
Geethu
Ayan
Sithara
Sanvika
Jagan
-------------------------------------------
Stack after removing index position 1 : 
Anjana
Ayan
Sithara
Sanvika
Jagan
*/
