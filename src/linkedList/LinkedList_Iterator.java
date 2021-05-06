package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Iterator 
{
  public static void main(String [] arg)
	{
	LinkedList ls= new LinkedList();
	ls.add("Akash");
	ls.add("Yogesh");
	ls.add("Rohit");
	ls.add("Ranjit");
	ls.add("Ajinkya");
	ls.add("Deepak");	
	System.out.println(ls.size());
	Iterator itr = ls.iterator();
	System.out.println("Print Data Elements using Iterator");
	System.out.println("Print Data Elements using for each loop");
	for(Object obj:ls)
	   {
		System.out.println(obj);
	   }
	System.out.println("Print Data Elements using for loop");
	for(int i=0;i<=ls.size()-1;i++)
	{
		System.out.println(ls.get(i));
	}
	System.out.println("Print Data Elements using while loop");
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}

	}
}
