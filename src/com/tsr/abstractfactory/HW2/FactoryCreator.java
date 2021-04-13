package com.tsr.abstractfactory.HW2;

public class FactoryCreator {
	public static AbstractFactory getFactoryOf(String name) {
		if(name == null)
			return null;
		else if(name.equalsIgnoreCase("Loan"))
			return new LoanFactory();
		else if(name.equalsIgnoreCase("Bank"))
			return new BankFactory();
		else
			return null;
	}
}
