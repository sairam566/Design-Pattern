package com.tsr.factorymethod;

public class RectangleFactory extends AbstractShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Rectangle();
	}

}
