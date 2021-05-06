package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Iterator 
{
 public static void main (String args[])
 {
	TreeSet ts = new TreeSet();
	ts.add(5000);
	ts.add(78960);
	ts.add(123650);
	ts.add(123650);
	ts.add(1000);
	ts.add(15000);
	Iterator itr = ts.iterator();
	System.out.println("print data using Iterator");
	System.out.println("print data using for each loop");
	for(Object obj : ts)
	{
	  System.out.println(obj);	
	}
	System.out.println("print data using while loop");
	while(itr.hasNext())
	{
	  System.out.println(itr.next());
	}
	System.out.println("First element is "+ts.first());
	System.out.println("Last element is "+ts.last());
	System.out.println("Print data in descending order");
	Iterator itrt = ts.descendingIterator();
	while(itrt.hasNext())
	{
		System.out.println(itrt.next());
	}
	
 }
}