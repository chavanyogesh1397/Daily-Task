package array_list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Using_HashSet 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(500);
		al.add(100);
		al.add(null);
		al.add(null);
		al.add(null);
		System.out.println(al);
		//Iterator itr = al.iterator();
		HashSet hs = new HashSet(al);
		System.out.println(hs);
	}
}
