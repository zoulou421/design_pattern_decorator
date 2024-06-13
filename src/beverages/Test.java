package beverages;

import decorators.Caramel;
import decorators.Chocolate;

public class Test {

	public static void main(String[] args) {
		Beverage b=new Expresso();
		
		System.out.println("---------------");
		
		System.out.println(b.getDescription());
		System.out.println(b.cout());
		
		System.out.println("------DECORATOR---------");
		b=new Chocolate(b);
		System.out.println(b.getDescription());
		System.out.println(b.cout());
		
		System.out.println("------DECORATOR---------");
		b=new Caramel(b);
		System.out.println(b.getDescription());
		System.out.println(b.cout());
		
		Beverage c1=new Expresso();
		
		c1=new Caramel(c1);
		System.out.println(c1.getDescription());
		System.out.println(c1.cout());
		

	}

}
