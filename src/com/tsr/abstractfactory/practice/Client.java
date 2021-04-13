package com.tsr.abstractfactory.practice;

public class Client {

	public static void main(String[] args) {
		AbstractFactort factort = FactoryProducts.getProduct("color");
		Color redColor = factort.getColor("RED");
		redColor.fill();
	}

}
