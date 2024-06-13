package decorators;

import beverages.Beverage;

public class Caramel extends AbstractDecorator {

	public Caramel(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+"  added Caramel";
	}

	@Override
	public double cout() {
		// TODO Auto-generated method stub
		return 0.8+beverage.cout();
	}
	


	
}
