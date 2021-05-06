package vector;

import java.util.ListIterator;
import java.util.Vector;

public class Vector_ListIterator 
{
	public static void main(String[] args) 
	{
		Vector r = new Vector();
		r.add("Akash");
		r.add("Yogesh");
		r.add("Rohit");
		r.add("Rohit");
		r.add("Ranjit");
		r.add(20015);
		System.out.println(r.size());
		System.out.println("Print elements using ListIterator");
		ListIterator ls = r.listIterator();
		while(ls.hasNext())
		{
			System.out.println(ls.next());
		}
		System.out.println("Print elements using for each loop");

	}
}
