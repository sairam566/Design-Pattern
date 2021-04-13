package com.tsr.abstractfactory.practice;

public interface Shape {
	public abstract void draw();
}

class Rectangle implements Shape{
	@Override
	public void draw() {
		System.out.println("From Rectangle Draw");
	}
}

class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("From Circle Draw");
	}
}

class Square implements Shape{
	@Override
	public void draw() {
		System.out.println("From Square Draw");
	}
}