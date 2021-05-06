package Method_Overview;

//import Method_Overview1.Constructor1;

public class Constructor 
{
	Constructor()
	{
		int x;
		int y;
		System.out.println("User define Constructor with zero parameter");
	}
	Constructor(int rollno,String Name,String lastname)
	{
		System.out.println("Student Roll No is " + rollno);
		System.out.println("Student First Name is " + Name );
		System.out.println("Student Last Name is: " + lastname);
	}
	Constructor(int rollno,String Name)
	{
		System.out.println("Student Roll No is " + rollno);
		System.out.println("Student First Name is " + Name );
	}
	Constructor(int rollno)
	{
		System.out.println("Student Roll No is " + rollno);
	}
	
	public static void main(String[] args)
	{
		Constructor z = new Constructor(11,"Yogesh","Chavan");
		//Constructor1 xyz = new Constructor1(10,20);
		
	}
}
