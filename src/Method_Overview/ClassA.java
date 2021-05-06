package Method_Overview;

public class ClassA 
{

public void sum()
{
	int a =20;
	int b=30;
	System.out.println("Sum of Two no is "+ (a+b));
}
public void multi()
{
	int b=50;
	int c=50;
	System.out.println("Multiplication of Two no is "+ (b*c));
}
	public static void main(String[] args) 
	{
		/*ClassB.Dog();
		ClassB x= new ClassB();
		x.Tiger();*/
		ClassA z = new ClassA();
		z.sum();
	}
}
