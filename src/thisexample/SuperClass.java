package thisexample;

public class SuperClass extends ThisClass
{
	int i=10;
	static int j=10;
	void sum1()
	{
		int i=20;
		int j=20;
		System.out.println(super.i+super.j);
	}
	static void plus()
	{
		int i=100;
		int j=200;
		System.out.println(i+j);
	}
	public static void main(String[] args) 
	{
		System.out.println();
		SuperClass sp = new SuperClass();
		sp.sum1();
		//plus();
	}
}
