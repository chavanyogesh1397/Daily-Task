package thisexample;

public class ThisEx 
{
	int i=10;
	int j=20;
	public void sum(int s, int y)
	{
		int a;
		int b;
		a=this.i;
		b=this.j;
		
		System.out.println(a+b);
		
	}
	//if we use this keyword then he will check only global variables.
	public static void main(String[] args) 
	{
		ThisEx x = new ThisEx();
		x.sum(20, 20);
	}
}
