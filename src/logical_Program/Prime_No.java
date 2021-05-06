package logical_Program;

public class Prime_No 
{
	public static void main(String[] args) 
	{
		int num=4;
		int count =0;
		if(num==0 || num==1)
		{
			System.out.println("Num is not prime");
		}
		else
		{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("No is not prime");
				count++;
				break;
			}
		}
		if(count ==0)
		{
			System.out.println("No is prime");
		}
		}

	}
}
