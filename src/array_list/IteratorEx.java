package array_list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx 
{
	public static void main(String[] args) 
	{
		ArrayList ar = new ArrayList();
		ar.add("Akash");
		ar.add("Yogesh");
		ar.add("Rohit");
		ar.add("Ranjit");
		ar.add("Vaibhav");
		ar.add("Deepak");
		System.out.println("Size of Array List: " +ar.size());
		System.out.println("Print List using Iterator");
		Iterator itr = ar.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
