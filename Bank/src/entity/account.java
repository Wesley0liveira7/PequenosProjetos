package entity;

public class account {

	private int numberAccount;
	private String name;
	private double balance;

	public account(int numberAccount, String name) {
		this.numberAccount = numberAccount;
		this.name = name;
	}

	public account(int numberAccount, String name, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.name = name;
		deposit(initialDeposit);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInitialDeposit() {
		return balance;
	}

	public double getNumberAccount() {
		return numberAccount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	public String toString() {
		return "Account "
				+ numberAccount
				+ ", Holder: "
				+ name
				+ ", balance: $ "
				+ String.format("%.2f", balance);
	}
}
