package polymorphism;

public class Example extends MethodOverloading
{
	 void sum(int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);
	}
	
	public static void main(String[] args) 
	{
		Example e = new Example();
		e.sum(500, 400);
	}
}
