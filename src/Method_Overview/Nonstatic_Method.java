package Method_Overview;
//Not Static method call Using object
public class Nonstatic_Method 
{
	int x;
	int y;
	void sum()
	{
		System.out.println(x+y);
	}
	public static void main(String[] args) 
	{
		Nonstatic_Method z = new Nonstatic_Method();
		z.x=50;
		z.y=50;
		z.sum();
	}
}
