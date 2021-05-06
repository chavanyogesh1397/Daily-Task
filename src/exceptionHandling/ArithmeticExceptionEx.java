package exceptionHandling;

public class ArithmeticExceptionEx 
{
	public void div()
	{
		int i=20;
		int j=0;
		try
		{
			int c=i/j;
			System.out.println(c);
		}
		catch(Exception t)	//here we used only Exception.
		{
			int c=i/1;
			System.out.println(c);
		}
		
	}
	public void div1()
	{
		int i=10;
		int j=0;
		try {		//here we used ArithmeticException.
			int c=i/j;
			System.out.println(c);
			}
		catch(ArithmeticException e) 
		{
			int c=i/1;
			System.out.println(c);
		}
		System.out.println("Other program excecution start");
	}
	public static void main(String[] args) 
	{
		
		ArithmeticExceptionEx a = new ArithmeticExceptionEx();
		a.div1();
		a.div();
		System.out.println("program excecution end");
	}
}
