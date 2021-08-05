import java.util.*;
public class BankAccount2 {

	private String name;
	private int id;
	private double balance;
	private ArrayList<String> transactions;
   
	public BankAccount2(String name, int id) {
		this.name = name;
		this.id = id;
		this.balance = 0.0;
		this.transactions = new ArrayList<String>();
	}
	public void deposit(double amount) {
		this.balance += amount;
		transactions.add("Deposit of $" + amount);
	}
	public void withdraw(double amount) {
		this.balance -= amount;
		transactions.add("Withdrawal of $" + amount);
	}
	public double getBalance() {
		return balance;
	}
	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void printLog() {
		for (int i = 0; i < this.transactions.size(); i++) {
			System.out.println(transactions.get(i));
		}
	}
}

