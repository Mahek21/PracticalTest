package firstPackage;

import java.util.HashMap;

@SuppressWarnings("static-access")
public class BankAccount {

	private double Account;
	private double Balance;
	private Denominations denominations;
	public HashMap<Double,Double> hmap = new HashMap<Double, Double>();

	{
		denominations = denominations.ERROR;
	}

	public double getBalance(double accno) {
		return hmap.get(accno);
	}

	protected void setBalance(double balance,double accno) {
		hmap.put(accno, balance);
	}

	public double getAccount(double accno) {
		return hmap.get(accno);
	}

	protected void setAccount(double account) {
		Account = account;
	}

	public void withdraw(double amount, double accno) {
		if (validWithdrawl(amount, accno)) {
			setBalance(getBalance(accno) - amount, accno);
		}
	}

	public boolean validWithdrawl(double amount, double accno) {
		if (getBalance(accno) > amount)
			return true;
		else
			return false;
	}

	public boolean validAccountNo(double accno) {
		boolean check = PatternMatch.patternMatch(accno + "", "([0-9]{10})");
		if (check) {
			return true;
		} else {
			return false;
		}
	}

	public void deposit(double amount, double accno) {
		setBalance(getBalance(accno) + amount, accno);
	}

	public void populateList() {
		hmap.put(Double.parseDouble("1234567891"), Double.parseDouble("10000"));
		hmap.put(Double.parseDouble("1234567892"), Double.parseDouble("20000"));
		hmap.put(Double.parseDouble("1234567893"), Double.parseDouble("30000"));
		hmap.put(Double.parseDouble("1234567894"), Double.parseDouble("40000"));
		hmap.put(Double.parseDouble("1234567895"), Double.parseDouble("50000"));
		hmap.put(Double.parseDouble("1234567896"), Double.parseDouble("60000"));
		hmap.put(Double.parseDouble("1234567897"), Double.parseDouble("70000"));
		hmap.put(Double.parseDouble("1234567898"), Double.parseDouble("80000"));
		hmap.put(Double.parseDouble("1234567899"), Double.parseDouble("90000"));
		hmap.put(Double.parseDouble("1234567890"), Double.parseDouble("25000"));
	}

	public String getDenominations() {
		return denominations.toString();
	}

	public void setDenominations(Denominations denominations) throws Exception {
		if (denominations.toString().equals("0"))
			throw new Exception("Invalid Denomination");
		this.denominations = denominations;
	}
	
	public double sdenominations(double accno){
		return (getBalance(accno)/Integer.parseInt(getDenominations()));
	}
}
