package logical_Program;
public class PatternDesign1 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=7; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		{
			for(int x =2;x<=7;x++)
			{
				for(int y =1;y<=x;y++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int k=5;k<=20;k++)
			{
				System.out.println("##");
			}
		}

	}
}


/*

* * * * *
* * * *
* * *
* *
* 





*/