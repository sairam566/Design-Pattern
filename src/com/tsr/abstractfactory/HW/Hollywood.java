package com.tsr.abstractfactory.HW;

public interface Hollywood {
	public abstract void getMovieName();
}

class HollywoodComady implements Hollywood{
	@Override
	public void getMovieName() {
		System.out.println("Hollywood comady movie: ACE Ventora");
	}
}

class HollywoodAction implements Hollywood{
	@Override
	public void getMovieName() {
		System.out.println("Hollywood Action movie: MI-1,2,3,4,5,6");
	}
}