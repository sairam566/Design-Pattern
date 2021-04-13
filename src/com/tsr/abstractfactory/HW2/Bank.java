package com.tsr.abstractfactory.HW2;

public interface Bank {
	public abstract void getBankName();
}

class SBI implements Bank{
	@Override
	public void getBankName() {
		System.out.println("From SBI Bank");
	}
}
class HDFC implements Bank{
	@Override
	public void getBankName() {
		System.out.println("From HDFC Bank");
	}
}

class Axis implements Bank{
	@Override
	public void getBankName() {
		System.out.println("From Axis Bank");
	}
}