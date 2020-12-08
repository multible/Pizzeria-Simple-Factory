
public class Pizzeria 
{
	private PizzaFactory factory;	

	public Pizzeria( PizzaFactory f )
	{
		factory = f;
	}
	
	public Pizza orderPizza(PizzaFactory.PizzaType type)
	   {
		Pizza pizza;

	    pizza = factory.createPizza(type); 

	    pizza.prepare();
		pizza.bake();
		pizza.cut();

		return pizza;
	   	}

}
