package com.tsr.abstractfactory.HW;

public interface Bollywood {
	public abstract void getMovieName();
}

class BollywoodComady implements Bollywood{
	@Override
	public void getMovieName() {
		System.out.println("Bollywood Comady movie: Housefull-1,2 ");
	}
}
class BollywoodAction implements Bollywood{
	@Override
	public void getMovieName() {
		System.out.println("Bollywood Action movie: DOM-2 ");
	}
}