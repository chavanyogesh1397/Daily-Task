package casting;

public class Zomato extends Customer
{
	void Price()
	{
		System.out.println("After Applying 'Welcome' Coupen the final discounted amount is: " + (super.BiryaniPrice-50));
	}
	void DeliveryBoyTip()
	{
		System.out.println("Add Tip 10rs " + (super.BiryaniPrice+10));
	}
}
 