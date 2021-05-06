package thisexample;

public class SuperEx3 extends SuperEx
{
	int i=10;
	int j=20;
	public void Addition()
	{
		System.out.println(super.i+super.j);
	}
	public static void main(String[] args) 
	{
		SuperEx3 t = new SuperEx3();
		t.Addition();
	}
}
