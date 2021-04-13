package com.tsr.factorymethod;

public abstract class AbstractShapeFactory {
	
	protected abstract Shape factoryMethod();
	
	public Shape getShape() {
		return factoryMethod();
	}
}
