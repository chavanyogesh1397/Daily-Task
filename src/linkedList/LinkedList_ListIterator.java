package linkedList;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_ListIterator 
{
	public static void main(String[] args) 
	{
		LinkedList ls = new LinkedList();
		ls.add("Akash");
		ls.add("Deepak");
		ls.add("Yogesh");
		ls.add("Ajinkya");
		ls.add("Vaibhav");
		System.out.println(ls);
		System.out.println("Size of Linked List: " +ls.size());
		System.out.println("Print data elements using List Iterator");
		ListIterator litr = ls.listIterator();
		System.out.println("Print data elements Using each loop");
		for(Object obj: ls)
		{
			System.out.println(obj);
		}
		System.out.println("Print data elements Using for loop");
		for(int i=0;i<=ls.size()-1;i++)
		{
			System.out.println(ls.get(i));
		}
		System.out.println("Print data elements Using while loop");
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
	}
}
