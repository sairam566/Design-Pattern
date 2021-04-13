package com.tsr.abstractfactory.HW2;
abstract class AbstractFactory{  
  public abstract Bank getBank(String bank);  
  public abstract Loan getLoan(String loan);  
} 

class BankFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bank) {
		if(bank == null)
			return null;
		else if(bank.equalsIgnoreCase("HDFC"))
			return new HDFC();
		else if(bank.equalsIgnoreCase("SBI"))
			return new SBI();
		else if(bank.equalsIgnoreCase("Axis"))
			return new Axis();
		else
			return null;
	}

	@Override
	public Loan getLoan(String loan) {
		return null;
	}
}

class LoanFactory extends AbstractFactory{
	@Override
	public Bank getBank(String bank) {
		return null;
	}
	@Override
	public Loan getLoan(String loan) {
		if(loan == null)
			return null;
		else if(loan.equalsIgnoreCase("HL"))
			return new HouseLoan();
		else if(loan.equalsIgnoreCase("EL"))
			return new EducationalLoan();
		else if(loan.equalsIgnoreCase("BL"))
			return new BussinessLoan();
		else
			return null;
	}
	
}