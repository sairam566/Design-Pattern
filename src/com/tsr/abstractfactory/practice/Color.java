package com.tsr.abstractfactory.practice;

public interface Color {
	public abstract void fill();
}

class Red implements Color{
	@Override
	public void fill() {
		System.out.println("Filling Red Color");
	}
}

class Green implements Color{
	@Override
	public void fill() {
		System.out.println("Filling Green Color");
	}
}

class Blue implements Color{
	@Override
	public void fill() {
		System.out.println("Filling Blue Color");
	}
}