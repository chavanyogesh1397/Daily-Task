package gheneralization;

public class SavingAc implements BankAccounts
{

	public void deposite() 
	{
		System.out.println("Deposite Facility Available");
	}
	public void withdraw() 
	{
		System.out.println("Withdraw Facility Available");
	}
	public void interest() 
	{
		System.out.println("interest Facility Available");
	}
	public void amb() 
	{
		System.out.println("You have to maintain AMB of rs 2000");
	}
}
