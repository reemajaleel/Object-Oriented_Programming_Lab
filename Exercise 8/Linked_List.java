//Program to remove all the elements from a linked list

import java.util.*;

class Linked_List
{
	public static void main(String args[])
	{
		// Create a linked list.
		LinkedList<String> ll = new LinkedList<String>();
		LinkedList<String> l = new LinkedList<String>();

		// Add elements to the linked list.
		ll.add("Fathima");
		ll.add("Shamil");
		ll.add("Reema");
		ll.add("Aneetha");
		ll.add("Alen");
		ll.addLast("Naseera");
		ll.addFirst("Shamna");
		ll.add(1, "Ambili");
		System.out.println("Original contents of ll: " + ll);

		// Remove elements from the linked list.
		ll.removeAll(ll);
		System.out.println("Contents of ll after deletion using removeAll() method: " + ll);

		// Add elements to the linked list.
		l.add("Aswin");
		l.add("Anand");
		l.add("Saranya");
		l.add("Hasna");
		l.add("Scissna");
		l.addLast("Vani");
		l.addFirst("Amrutha");
		l.add(1, "Janan");
		System.out.println("Original contents of l: " + l);
		l.clear();
		System.out.println("Contents of l  after deletion using clear() method: " + l);
	}
}




/*
OUTPUT:

Original contents of ll: [Shamna, Ambili, Fathima, Shamil, Reema, Aneetha, Alen, Naseera]
Contents of ll after deletion using removeAll() method: []
Original contents of l: [Amrutha, Janan, Aswin, Anand, Saranya, Hasna, Scissna, Vani]
Contents of l  after deletion using clear() method: []

*/
