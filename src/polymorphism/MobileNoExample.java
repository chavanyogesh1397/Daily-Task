package polymorphism;

public class MobileNoExample 
{
	void ContactSave(String name,int MobileNumber1)
	{
		System.out.println("Contact Person: " + name);
		System.out.println("Mobile No: "+ MobileNumber1);
	}
	void ContactSave(String name,double MobileNumber1,long MobileNumber2)
	{
		System.out.println("Contact Person: " + name);
		System.out.println("Mobile 1st No: "+ MobileNumber1);
		System.out.println("Mobile 2nd No: "+ MobileNumber2);
	}
	public static void main(String[] args)
	{
		MobileNoExample t = new MobileNoExample();
		t.ContactSave("Akash", 741236985);
		t.ContactSave("Yogesh", 865558653, 720828582);
	}
}
