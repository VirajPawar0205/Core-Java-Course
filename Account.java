package Bank;

public abstract class Account {
	public abstract void AcDetails();
	public abstract void Withdrawal();
	public abstract void Deposit();
	public abstract void BalEnquire();
	
	public void BankDetails()
	{
		System.out.println("Bank Details ");
	}

}
