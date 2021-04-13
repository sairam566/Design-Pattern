package com.tsr.abstractfactory.practice;

public abstract class AbstractFactort {
	public abstract Shape getShape(String name);
	public abstract Color getColor(String name);
}

class ShapeFactory extends AbstractFactort{
	@Override
	public Shape getShape(String name) {
		if(name == null) 
			return null;
		else if(name.equalsIgnoreCase("Circle")) 
			return new Circle();
		else if(name.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else if(name.equalsIgnoreCase("Square"))
			return new Square();
		else
			return null;
	}
	@Override
	public Color getColor(String name) {
		return null;
	}
}

class ColorFactory extends AbstractFactort{

	@Override
	public Shape getShape(String name) {
		return null;
	}

	@Override
	public Color getColor(String name) {
		if(name == null)
			return null;
		else if(name.equalsIgnoreCase("Red"))
			return new Red();
		else if(name.equalsIgnoreCase("Green"))
			return new Green();
		else if(name.equalsIgnoreCase("Blue"))
			return new Blue();
		else
			return null;
	}
}

