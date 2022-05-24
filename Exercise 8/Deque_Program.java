//Program to demonstrate the addition and deletion of elements in deque

import java.util.*;

public class Deque_Program
{
	public static void main(String[] args)
	{

		//Creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Sabna");
		deque.add("Anjusha");
		deque.add("Resmi");
		System.out.println("The elements of deque are : "+deque);

		deque.remove();
		System.out.println("Deque elements after removing : "+deque);

		deque.remove();
		System.out.println("Deque elements after removing : "+deque);
	} 
}

/*
OUTPUT:

The elements of deque are : [Sabna, Anjusha, Resmi]
Deque elements after removing : [Anjusha, Resmi]
Deque elements after removing : [Resmi]
*/
