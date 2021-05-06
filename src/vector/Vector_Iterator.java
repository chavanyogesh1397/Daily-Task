package vector;

import java.util.Iterator;
import java.util.Vector;

public class Vector_Iterator
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add("Akash");
		v.add("Yogesh");
		v.add("Rohit");
		v.add("Ranjit");
		System.out.println("Size of Vector element is: "+v.size());
		System.out.println("Print Element Using Iteration");
		Iterator itr = v.iterator();
		System.out.println("Print Elements Using while loop");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Print Elements Using For Each loop");
		for (Object o:v)
		{
			System.out.println(o);
		}
		v.add(2, "Bhosle");
		System.out.println("After adding new element");
		System.out.println(v);
		v.remove(2);
		System.out.println("After Removing 2nd Index");
		System.out.println(v);
		System.out.println(v.isEmpty());
	}
}
