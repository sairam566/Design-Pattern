package com.tsr.abstractfactory.practice;

public class FactoryProducts {
	public static AbstractFactort getProduct(String name) {
		
		if(name == null)
			return null;
		else if(name.equalsIgnoreCase("Shape"))
			return new ShapeFactory();
		else if(name.equalsIgnoreCase("Color"))
			return new ColorFactory();
		else
			return null;
	}
}
