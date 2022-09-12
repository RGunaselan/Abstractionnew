package org.fullyabstract;

public class SBI implements RBI{
	public void amountToBank(int amount) {
System.out.println(amount);
	}
public void interestRate(int rate) {
	System.out.println(rate);
}
public static void main(String[] args) {
	SBI sbi = new SBI();
	sbi.amountToBank(10000);
	sbi.interestRate(5);
	
	}
}

