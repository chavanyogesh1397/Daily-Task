package Practice;

import package1.ClassC;

public class ClassA 
{
	//Non Static Method
	public void sum()
	{
		int a=10;
		int b =20;
		System.out.println("Sum of two no."+ (a+b));
	}
	
	public static void main(String[] args) 
	{
		ClassA x = new ClassA();
		x.sum();
		ClassB y = new ClassB();
		y.multi();
		ClassC z = new ClassC();
		z.Color();
	}
}
