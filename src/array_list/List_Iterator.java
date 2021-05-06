package array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List_Iterator 
{
	public static void main(String[] args) 
	{
		ArrayList ar = new ArrayList();
		ar.add("Ajinkya");
		ar.add("Yogesh");
		ar.add("Akash");
		ar.add("Rohit");
		ar.add("Ranjit");
		System.out.println(ar.size());
		ar.add(3, "Deepak");
		System.out.println("Print date Using List Iterator");
		ListIterator itr = ar.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
