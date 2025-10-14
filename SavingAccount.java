package Bank;

public class SavingAccount extends Account{

	@Override
	public void AcDetails()
	{
		System.out.println("Getting Account Details");
	}
	
	@Override
	public void Deposit()
	{
		System.out.println("Getting Deposit");
	}
	
	@Override
	public void Withdrawal()
	{
		System.out.println("Getting Withdrawal");
	}
	
	@Override
	public void BalEnquire()
	{
		System.out.println("Getting Ballance Enquire Details ");
	}
}
