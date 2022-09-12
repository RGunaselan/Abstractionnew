package org.abstractclass;

public class ICICICustomers extends ICICIBank{
	

	public void loanInterestRate(int rate) {
		System.out.println("Customer interest rate is:"+rate);


	}
	public static void main(String[] args) {
		ICICICustomers iciciCustomers = new ICICICustomers();
		iciciCustomers.loanInterestRate(11);
		iciciCustomers.bankAdd("Chennai");
		
	}

}
