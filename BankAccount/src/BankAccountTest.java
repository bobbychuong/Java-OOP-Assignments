
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.showAccNumber();
		ba.BankAccount();
		ba.getChecking();
		ba.getSaving();
		ba.depositChecking(25);
		ba.depositSaving(100);
		ba.withdrawChecking(100);
		ba.withdrawSaving(10);
		ba.totalAmount();
	}

}
