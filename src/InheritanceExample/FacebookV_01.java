package InheritanceExample;

//Single level Inheritance and Multilevel Inheritance

public class FacebookV_01
{
	
	public void textMessage()
	{
		System.out.println("You can send Text Message!!");
	}
}	
	
class FacebookV_02 extends FacebookV_01
{
	
	public void facebookCall()
	{
		System.out.println("You can call on Facebook!!");
	}
	
	public void Sticker()
	{
		System.out.println("You can Send Stickers on Facebook!!");
	}
	
}
class FacebookV_03 extends FacebookV_02
{
	public void vedioCall()
	{
		System.out.println("You can use Vedio call on Facebook!!");
	}
}
	
