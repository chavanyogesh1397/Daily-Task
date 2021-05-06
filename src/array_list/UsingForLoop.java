package array_list;

import java.util.ArrayList;

public class UsingForLoop 
{
	public static void main(String[] args) 
	{
		ArrayList ar = new ArrayList();
		ar.add("Akash");
		ar.add("Yogesh");
		ar.add("Ajinkya");
		ar.add("Deepak");
		ar.add("Rohit");
		System.out.println("Print data using for loop");
		for(int i=0;i<=ar.size()-1;i++)
		{
			System.out.println(ar.get(i));
		}
	}
	
}
