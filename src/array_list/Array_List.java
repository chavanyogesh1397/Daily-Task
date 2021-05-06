package array_list;

import java.util.ArrayList;

public class Array_List 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("Akash");
		al.add("Yogesh");
		al.add("Rohit");
		al.add("Ranjit");
		al.add("Vaibhav");
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains("Ranjit"));
		System.out.println(al.get(2));
		al.add(2, "Ajinkya");
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		al.remove(2);
		System.out.println(al);
		al.set(3, "Mahesh");
		System.out.println(al);
		System.out.println(al.get(5));
		al.remove(2);
		System.out.println(al);
	}
}
