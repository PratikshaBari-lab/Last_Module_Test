
public class BankManagement {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount account1 = new BankAccount(1001, "Rahul", 5000.0);
		BankAccount account2 = new BankAccount(1002, "Amit", 3000.0);
		
		account1.AccountDetails();
		account1.deposit_money(2000);
		account2.AccountDetails();
		account1.AccountDetails();
	}

}

class BankAccount{
	
	private int account_number;
	private String account_holder;
	private double account_balance;
	
	public BankAccount(int account_number, String account_holder, double account_balance) {
		super();
		this.account_number = account_number;
		this.account_holder = account_holder;
		this.account_balance = account_balance;
	}

	public int getAccount_number() {
		return account_number;
	}

	public String getAccount_holder() {
		return account_holder;
	}

	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}

	public double getAccount_balance() {
		return account_balance;
	}

	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	
	public void deposit_money(double amount) {
		if(amount>0) {
			this.account_balance = getAccount_balance()+amount;
			System.out.println("\nDeposit Successful: "+amount);
			System.out.println("Transaction: Salary Credit");
			System.out.println("Balance: "+getAccount_balance());
		}else {
			System.out.println("Unsuccessful Attempt!");
		}
	}
	
	public void AccountDetails() {
		System.out.println("\nBank: ABC Bank");
		System.out.println("Account Number: "+account_number);
		System.out.println("Account Holder: "+account_holder);
		System.out.println("Account Balance: "+account_balance);
	}
	
}





