package Practice;

public class Static1 extends StaticM
{
	 void sum()
	{
		System.out.println("Sum of three no is: "+(20+30+50));
	}
	public static void main(String[] args) 
	{
		Static1 s = new Static1();
		//s.sum();
		s.color();
		 
	}
	
	protected void color() 
	{

		System.out.println("Color is black");
	}
}
