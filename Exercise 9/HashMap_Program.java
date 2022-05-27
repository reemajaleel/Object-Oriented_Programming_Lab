//Program to demonstrate the working of Map interface by adding, changing and removing elements.

import java.util.*;

class HashMap_Program 
{
	public static void main(String args[]) 
	{

		// Create a hash map.
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// Put elements to the map
		hm.put(new Integer(1), "Madona");
		hm.put(new Integer(2), "Angel");
		hm.put(new Integer(3), "Gokul");
		hm.put(new Integer(4), "James");
		hm.put(new Integer(5), "Agnus"); 
		System.out.println("The elements are : "+hm);

		//changing elements
		hm.put(new Integer(5), "Nisma"); 
		System.out.println("Agnus changed to Nisma : "+hm);

		//removing element
		hm.remove(new Integer(4));
		System.out.println("Removed James : "+hm);

	}
}

/*
OUTPUT:

The elements are : {1=Madona, 2=Angel, 3=Gokul, 4=James, 5=Agnus}
Agnus changed to Nisma : {1=Madona, 2=Angel, 3=Gokul, 4=James, 5=Nisma}
Removed James : {1=Madona, 2=Angel, 3=Gokul, 5=Nisma}
*/
