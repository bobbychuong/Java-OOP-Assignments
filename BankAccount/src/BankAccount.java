
import java.util.*;
import java.util.Random;
// Create a BankAccount class
// Attributes (string)account number,(long)checking balance,(long)savings balance.
// Create a class member(static)that has the number of accounts created thus far.
// Create a class member(static) that tracks the total amount of money stored in every account created.
// Create a private method that returns a random 10 digit account number
public class BankAccount {
	// Following attributes
	protected String accountNumber;
	protected long checkingBalance;
	protected long savingsBalance;
	protected static int numAccs;
	protected static int totalAmt;
	protected String bankAccount;
	public void BankAccount() {
		accountNumber = RandAccNumber();
		numAccs++;
		System.out.print("Number of accounts:" + numAccs);
	}
	public String RandAccNumber(){
		Random random = new Random();
		String accountNumber = "";
		for(int i=0;i<=10;i++) {
			int temp = (int) Math.floor(Math.random() * 10);
			String tempAsString = Integer.toString(temp);
			accountNumber += tempAsString;
		}
		return accountNumber;
    }
	public void getChecking() {
		System.out.println("Getting Checking Balance:" + checkingBalance);
	}
	public void getSaving() {
		System.out.println("Getting Saving Balance:" + savingsBalance);
	}
	public void depositChecking(int checking) {
		this.checkingBalance += checking;
		System.out.print("Depositing to checking:$" + checking);
	}
	public void depositSaving(int saving) {
		this.savingsBalance += saving;
		System.out.print("Depositing to savings:$" + this.savingsBalance);
	}
	public void withdrawChecking(int w) {
		if(this.checkingBalance <= 0) {
			System.out.print("Insufficient Fund");
		}
		else {
			this.checkingBalance -= w;
			System.out.print("Withdrawing from checkings:$" + this.checkingBalance);
		}	
	}
	public void withdrawSaving(int w) {
		this.savingsBalance -= w;
		System.out.print("Withdrawing from savings:$" + this.savingsBalance);
	}
	public void totalAmount() {
		long total = checkingBalance + savingsBalance;
		System.out.println("Total Balance:$" + total);
	}
	public void showAccNumber() {
		System.out.println("Account Number:" + accountNumber);
	}
}
