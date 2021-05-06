package logical_Program;
//4*3*2*1
public class FactorialNo 
{
	public static void main(String[] args) 
	{
		
		int num = 3;
		int fact=1;//2
		for(int i=1;i<=num;i++)//3<=3
		{
			fact=fact*i;//6
		}
		System.out.println(fact);
	}
}
