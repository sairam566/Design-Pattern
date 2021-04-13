package com.tsr.abstractfactory.HW2;

public abstract class Loan {
	protected double loanRate;
	public abstract void setLoanRate(double rate);
	public void calculateLoanPayment(double loanamount, int years) {
		double EMI;  
        int n;  
        n=years*12;  
        loanRate=loanRate/1200;  
        EMI=((loanRate*Math.pow((1+loanRate),n))/((Math.pow((1+loanRate),n))-1))*loanamount;  
        System.out.println("your monthly EMI is "+ EMI +" for the amount"+loanamount+" you have borrowed");
	}
}

class HouseLoan extends Loan{
	@Override
	public void setLoanRate(double rate) {
		loanRate = rate;
	}
}

class EducationalLoan extends Loan{
	@Override
	public void setLoanRate(double rate) {
		loanRate = rate;
	}
}

class BussinessLoan extends Loan{
	@Override
	public void setLoanRate(double rate) {
		loanRate = rate;
	}
}
