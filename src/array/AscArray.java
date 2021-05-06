package array;

import java.util.Arrays;

public class AscArray 
{
	public static void main(String[] args) 
	{
		int yz[]= {60,30,20,10,50};
		
		Arrays.sort(yz);//For Sorting the array=Asc/Desc
		System.out.println("Ascending Order");
		for(int i=0;i<=yz.length-1;i++)
		{
			System.out.println(yz[i]);
		}
		//Arrays.sort(yz);
		System.out.println("Ascending Order");
		for(int j=yz.length-1;j>=0;j--)
		{
			System.out.println(yz[j]);
		}
	}
}
