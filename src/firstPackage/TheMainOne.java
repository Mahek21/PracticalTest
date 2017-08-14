package firstPackage;

import java.util.HashMap;
import java.util.Scanner;

public class TheMainOne {

	public static void main(String ar[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		Denominations denominations = Denominations.ERROR;
		BankAccount transaction = new BankAccount();
		transaction.populateList();
		System.out.println("Enter account number : \t");
		double accno = sc.nextDouble();
		transaction.setAccount(accno);
		System.out.println("Enter 1. to Display Balance \n "
				+ "Enter 2. to Withdraw \n " + "Enter 3. to Diposit \n : \t");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("The Balance for Account is : "
					+ transaction.getAccount(accno));
			break;
		case 2:
			System.out.println("Enter the Amount to withdrawn : \t");
			double amount = sc.nextDouble();
			System.out.println("Enter the Denomination : \t");
			int denom = sc.nextInt();
			transaction.setDenominations(denominations.fromString(denom + ""));
			transaction.withdraw(amount,accno);
			System.out.println("The Denominations "
					+ transaction.sdenominations(accno));
			System.out.println("The Balance for Account is : "
					+ transaction.getAccount(accno));
			break;
		case 3:
			System.out.println("Enter the Amount to Deposit : \t");
			double amountDeposit = sc.nextDouble();
			transaction.deposit(amountDeposit,accno);
			System.out.println("The Balance for Account is : "
					+ transaction.getAccount(accno));
			break;
		}

	}
}
