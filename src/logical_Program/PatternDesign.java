package logical_Program;
/*
 *  	* * * * *
 *  	* * * * *
 * 		* * * * *
 * 		* * * * *
 * 		* * * * *
 */
public class PatternDesign 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=15;i++)
		{
			for(int j=i;j<=14;j++) 
			{
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=15;i++)
		{
			for(int j=1;j<=15;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
