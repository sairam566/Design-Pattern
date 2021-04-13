package com.tsr.factorymethod;

public class MainTest {

	public static void main(String[] args) {
		Shape shape1 = new CircleFactory().getShape();
		shape1.draw();
	}

}
