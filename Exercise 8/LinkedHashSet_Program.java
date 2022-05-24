//Program to demonstrate the creation of Set object using the LinkedHashset class

import java.util.*;

	public class LinkedHashSet_Program
	{
		public static void main(String args[])
		{
			LinkedHashSet<String> set=new LinkedHashSet<String>();
			set.add("Aneetha");
			set.add("Reema");
			set.add("Aneetha");
			set.add("Shamil");
			set.add("Ambili");

			System.out.println("Elements in Linked Hash Set : ");
			Iterator<String> itr=set.iterator();
			while(itr.hasNext())
			{

				System.out.println(itr.next());

			}
	} 
}

/*
OUTPUT:

Elements in Linked Hash Set : 
Aneetha
Reema
Shamil
Ambili
*/
