package vector;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Enumeration 
{
	public static void main(String args[])
	{
		Vector vc = new Vector();
		vc.add("Akash");
		vc.add("Yogesh");
		vc.add("Rohit");
		vc.add("Ranjit");
		vc.add("Ajinkya");
		vc.add("Deepak");
		vc.add("Akash");
		vc.add("Yogesh");
		vc.add("Rohit");
		vc.add("Ranjit");
		vc.add("Ajinkya");
		System.out.println("Print Data Elements using Enumeration");
		Enumeration enm = vc.elements();
		//System.out.println("Print Data Elements Using For Each Loop");
		//for(Object ob: enm)
		{
			//System.out.println(ob);
		}
		while(enm.hasMoreElements())
		{
			System.out.println(enm.nextElement());
		}
		System.out.println("Capasity of Vector " +vc.capacity());
		System.out.println("Print Data Elements Using For Each Loop");
		for(Object obj: vc)
		{
			System.out.println(obj);
		}
	}
}


