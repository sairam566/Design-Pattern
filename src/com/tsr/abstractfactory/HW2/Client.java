package com.tsr.abstractfactory.HW2;

public class Client {

	public static void main(String[] args) {
		AbstractFactory factory = FactoryCreator.getFactoryOf("bank");
		Bank bank = factory.getBank("sbi");
		bank.getBankName();
	}

}
