package exceptionHandling;

public class ArrayOutOfBondEx 
{
	public void aryoutofbondex()
	{
		int ab[]= {10,20,30,40,50};
		System.out.println("Lenght of array is "+ab.length);
		try 
		{
			for (int i=0;i<=6;i++)
			{
				System.out.println(ab[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handled Using ArrayIndexOutOfBoundsException catch");
		}
		
	}
	public void onlyexptn()
	{
		int ab[]= {101,700,107,409,701};
		System.out.println("Lenght of array is "+ab.length);
		try 
		{
			for (int i=0;i<=6;i++)
			{
				System.out.println(ab[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled using Only Exception catch");
		}
	}
	
	public static void main(String[] args) 
	{
		ArrayOutOfBondEx a = new ArrayOutOfBondEx();
		a.aryoutofbondex();
		a.onlyexptn();
	}
}
