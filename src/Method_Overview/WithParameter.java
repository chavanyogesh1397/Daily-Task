package Method_Overview;
//Using method with parameter
public class WithParameter 
{
	int C;
	public void sum(int A,int B)
	{
		C=A+B;
		System.out.println("Sum of is A & B is "+ C);
	}
	public static void multi(int A,int B)
	{
		 int C=A*B;
		System.out.println("Multiplicaation of A and Y is: " +C);
	}
	public static void main(String[] args) 
	{
		WithParameter x = new WithParameter();
		x.sum(10, 20);
		multi(5,5);
	}
}
