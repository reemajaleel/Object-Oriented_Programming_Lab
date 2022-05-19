//Maintain a list of Strings using ArrayList from collection framework, perform built-in operations.

import java.util.*;

class Array_List
{
	public static void main(String args[]) 
	{
		// Create an array list.
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial size of al: " + al.size());

		// Add elements to the array list.
		al.add("Aneetha");
		al.add("Fathima");
		al.add("Reema");
		al.add("Shamil");
		al.add("Alen");
		al.add("Naseera");
		al.add(1, "Ambili");
		System.out.println("Size of al after additions: " + al.size());

		// Display the array list.
		System.out.println("Contents of al: " + al);

		// Remove elements from the array list.
		al.remove("Naseera");
		al.remove(2);
		System.out.println("Size of al after deletions: " + al.size());
		System.out.println("Contents of al: " + al);
	}
}




/*
OUTPUT:

Initial size of al: 0
Size of al after additions: 7
Contents of al: [Aneetha, Ambili, Fathima, Reema, Shamil, Alen, Naseera]
Size of al after deletions: 5
Contents of al: [Aneetha, Ambili, Reema, Shamil, Alen]

*/
