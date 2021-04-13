package com.tsr.abstractfactory.HW;

public class MovieAbstractFactory {
	public static FactoryMovie getMovieType(String type) {
		
		if(type == null)
			return null;
		else if(type.equalsIgnoreCase("Hollywood"))
			return new HollywoodFactory();
		else if(type.equalsIgnoreCase("Bollywood"))
			return new BollywoodFactory();
		else
			return null;
	}
}
