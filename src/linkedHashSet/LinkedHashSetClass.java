package linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass 
{
    public static void main(String args[])
  {
     LinkedHashSet lhs = new LinkedHashSet();
	lhs.add("Akash");
	lhs.add("Akash");
	lhs.add("Yogesh");
	lhs.add("Deepak");
	lhs.add("Ajinkya");
	lhs.add(null);
	lhs.add(2000);
	lhs.add(null);
	System.out.println("Print data using iterator");
	Iterator itr = lhs.iterator();
	System.out.println("Print data using for each loop");
	for(Object obj:lhs)
	{
		System.out.println(obj);
	}
	System.out.println("Print data using for while loop");
	while(itr.hasNext())
	{
	  System.out.println(itr.next());
	}
	
  }
}