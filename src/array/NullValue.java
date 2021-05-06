package array;

public class NullValue 
{
	static int t;
	static String z;
	static boolean g;
	static double j;
	static float u;
	public static void main(String[] args) 
	{
		System.out.println("Defualt value of double "+ j);
		System.out.println("Defualt value of float "+u);
		System.out.println("Defualt value of boolean "+g);
		System.out.println("Defualt value of int "+t);
		System.out.println("Defualt value of String "+z);
		
		int xy[] = new int[6];
		xy[0]=10;
		xy[1]=20;
		xy[2]=30;
		xy[3]=40;
		xy[4]=50;
		xy[5]=60;
		//System.out.println(xy.length);
		for (int i=0;i<=xy.length-1;i++)
		{
			System.out.println(xy[i]);
		}
		//System.out.println("Index no of 7 is " +xy[7]);
	}
}
