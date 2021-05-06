package thisexample;

public class ThisClass 
{
	int i=30;
	static int j=30;
	void sum()
	{
		int i=20;
		int j=20;
		System.out.println(i+j);
	}
	static void addition()
	{
		int i = 0;
		int j=50;
		System.out.println(i+j);
	}
	public static void main(String[] args) 
	{
		ThisClass tc = new ThisClass();
		tc.sum();
		
		
		
		
		//tc.addition();
	}
}
