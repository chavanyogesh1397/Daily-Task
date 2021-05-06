package gheneralization;

public class CurrentAc implements BankAccounts
{
	public void deposite() 
	{
		System.out.println("Deposite Facility Available");
	}
	public void withdraw() 
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Withdraw Facility Available");
	}
	public void interest() 
	{
		System.out.println("interest Facility not Available");
	}
	public void amb() 
	{
		System.out.println("You have to maintain AMB of rs 5000");
	}
}
