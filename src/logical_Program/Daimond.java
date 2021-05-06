package logical_Program;

//  		   *
//            * *
//			 * * *
//			* * * *

public class Daimond 
{
	
	public static void main(String[] args) 
	{
		for (int i=1;i<=20;i++)
		{
			for(int j=i;j<=20;j++) 
			{
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int x=2;x<=20;x++)
		{
			for(int z=1;z<=x;z++)
			{
				
				System.out.print(" ");	
			}
			for (int y=x;y<=20;y++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}
}
