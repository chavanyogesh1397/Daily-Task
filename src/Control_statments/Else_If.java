package Control_statments;

public class Else_If 
{
	public static void main(String[] args) 
	{
		int Marks = 20;
		if(Marks>=35 && Marks <= 50)
		{
			System.out.println("3rd class");
		}
		else if(Marks>=50 && Marks <=60)
		{
			System.out.println("2nd class");
		}
		else if(Marks>=60 && Marks <=70)
		{
			System.out.println("1st Class");
		}
		else if(Marks>=70 && Marks <=100)
		{
			System.out.println("Dinstinction");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
