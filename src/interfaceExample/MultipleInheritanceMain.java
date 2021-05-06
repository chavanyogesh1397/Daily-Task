package interfaceExample;

public class MultipleInheritanceMain implements Child 
{
	public void car()
	{
		System.out.println("BMW,Audi");
	}
	public void bike()
	{
		System.out.println("Hornet");
	}
 	public void home()
 	{
 		System.out.println("Matoshree Villa");
 	}
 	public void farmhouse()
 	{
 		System.out.println("Kas farmhouse");
 	}
 	public void childeducation()
 	{
 		System.out.println("HSC");
 	}
	public static void main(String[] args) 
	{
		MultipleInheritanceMain m = new MultipleInheritanceMain();
		m.bike();
		m.car();
		m.home();
		m.farmhouse();
		m.childeducation();
	}
}
// Now we create implement class for creating object for interface
// Now we acquires the properties from child to implement class we use implements keyword.
// Then we write complete methods in this implement class
// and create object for this implements class and then call all methods.





