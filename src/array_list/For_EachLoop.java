package array_list;

import java.util.ArrayList;

public class For_EachLoop 
{
	
	public static void main(String[] args) 
	{
		ArrayList ar = new ArrayList();
		ar.add("Akash");
		ar.add("Ajinkya");
		ar.add("Yogesh");
		ar.add("Deepak");
		for(Object sc:ar)
		{
			System.out.println(sc);
		}
	}
}
