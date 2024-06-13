package decorators;

import beverages.Beverage;

public abstract class AbstractDecorator extends Beverage{
	protected Beverage beverage;

	public AbstractDecorator(Beverage beverage) {
		super();
		this.beverage = beverage;
	}
	
	public abstract String getDescription();
	

}
