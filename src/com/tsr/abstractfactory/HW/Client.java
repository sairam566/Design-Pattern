package com.tsr.abstractfactory.HW;

public class Client {

	public static void main(String[] args) {
		FactoryMovie mFactory = MovieAbstractFactory.getMovieType("Hollywood");
		
		Hollywood hollywood = mFactory.getHollywoodMovie("Action");
		
		hollywood.getMovieName();
		
	}

}
