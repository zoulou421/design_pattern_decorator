package decorators;

import beverages.Beverage;

public class Chocolate extends AbstractDecorator {

	public Chocolate(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+"  added chocolate";
	}

	@Override
	public double cout() {
		// TODO Auto-generated method stub
		return 0.7+beverage.cout();
	}
	


	
}
