package interfaceExample;

public class ImplimentsClass implements Child1
{
	public void House()
	{
		System.out.println("2BHK");
	}
	public void FarmHouse()
	{
		System.out.println("Satara Farm House");
	}
	public void bike()
	{
		System.out.println("CBR");
	}

	public static void main(String[] args) 
	{
		ImplimentsClass c = new ImplimentsClass();
		c.bike();
		c.House();
		c.FarmHouse();
	}

}
