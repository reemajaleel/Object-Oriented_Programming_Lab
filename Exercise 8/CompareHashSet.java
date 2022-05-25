//Write a Java program to compare two hash set

import java.util.*;

public class CompareHashSet 
{
	public static void main(String args[]) 
	{
		// Create a empty hash set
		HashSet<String> h_set1 = new HashSet<String>();
		// use add() method to add values in the hash set
		h_set1.add("Red");
		h_set1.add("Green");
		h_set1.add("Black");
		h_set1.add("White");
		System.out.println("First HashSet: "+h_set1);

		HashSet<String>h_set2 = new HashSet<String>();
		h_set2.add("Red");
		h_set2.add("Pink");
		h_set2.add("Black");
		h_set2.add("Orange");
		System.out.println("Second HashSet: "+h_set2);

		HashSet<String>h_set3 = new HashSet<String>();
		h_set3.add("Red");
		h_set3.add("Green");
		h_set3.add("Black");
		h_set3.add("White");
		System.out.println("Third HashSet: "+h_set3);

		// comparing first HashSet to another
		// using equals() method
		boolean value = h_set1.equals(h_set2);
  
		// print the value
		System.out.println("Are HashSet 1 and HashSet 2 equal : "+value);


		boolean values = h_set1.equals(h_set3);
  
		// print the value
		System.out.println("Are HashSet 1 and HashSet 3 equal : "+values);
      
	}
}

/*
OUTPUT:

First HashSet: [Red, White, Black, Green]
Second HashSet: [Red, Pink, Black, Orange]
Third HashSet: [Red, White, Black, Green]
Are HashSet 1 and HashSet 2 equal : false
Are HashSet 1 and HashSet 3 equal : true

*/
