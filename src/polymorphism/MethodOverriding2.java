package polymorphism;

public class MethodOverriding2 extends MethodOverride
{
	void Address()
	{
		System.out.println("Narhe Pune");
	}
	public static void main(String[] args) 
	{
		MethodOverriding2 n = new MethodOverriding2();
		n.personalDetails();
		n.Address();
	}
}
