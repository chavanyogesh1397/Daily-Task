package hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Hashset_Iterator 
{
 public static void main(String [] args)
    {
	HashSet hs = new HashSet();
	hs.add("Akash");	
	hs.add("Yogesh");
	hs.add("Ajinkya");
	hs.add("Rohit");
	hs.add("Ranjir");
	hs.add("Akash");
	hs.add(null);
	hs.add(null);
	
	System.out.println(hs.size());
	hs.add("Vaibhav");
	System.out.println("Printind data using Iterator");
	
	System.out.println("Printind data using for each loop");
	Iterator itr = hs.iterator();
	for(Object obj:hs)
	{
	  System.out.println(obj);
	}
	System.out.println("Print data using while loop");
	while(itr.hasNext())
	{
	  System.out.println(itr.next());
	}
	hs.clear();
	System.out.println("After Deletion of All elements");
	System.out.println(hs);
    }
}