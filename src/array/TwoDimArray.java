package array;

public class TwoDimArray 
{
	public static void main(String args[])
	{
		String ab[][]= {{"Akash","Yogesh","Rohit"},{"Vaibhav","Deepak","Ajinkya"}};
		for(int i=0;i<=ab.length-1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(ab[i][j]+ " ");
			}
			System.out.println();
		}
		for (int x=0;x<=ab.length-1;x++)
		{
			for(int y=2;y>=0;y--)
			{
				System.out.print(ab[x][y]+" ");
			}
			System.out.println();
		}
	}
}
