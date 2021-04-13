package com.tsr.factorymethodconcreat;

public class Client {

	public static void main(String[] args) {
		
		Shape shape = ShapeFactoryStatic.getShapeObject("circle");
		shape.shape();
	}

}
