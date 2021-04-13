package com.tsr.abstractfactory.HW;

public abstract class FactoryMovie {
	public abstract Bollywood getBollywoodMovie(String type);
	public abstract Hollywood getHollywoodMovie(String type);
}

class BollywoodFactory extends FactoryMovie{
	@Override
	public Bollywood getBollywoodMovie(String type) {
		if(type == null)
			return null;
		else if(type.equalsIgnoreCase("Comady"))
			return new BollywoodComady();
		else if(type.equalsIgnoreCase("Action"))
			return new BollywoodAction();
		else
			return null;
	}
	@Override
	public Hollywood getHollywoodMovie(String type) {
		return null;
	}
}

class HollywoodFactory extends FactoryMovie{
	@Override
	public Bollywood getBollywoodMovie(String type) {
		return null;
	}
	@Override
	public Hollywood getHollywoodMovie(String type) {
		if(type == null)
			return null;
		else if(type.equalsIgnoreCase("Comady"))
			return new HollywoodComady();
		else if(type.equalsIgnoreCase("Action"))
			return new HollywoodAction();
		else
			return null;
	}
	
}
