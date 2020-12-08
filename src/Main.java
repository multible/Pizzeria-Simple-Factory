// simple Factory-Class

public class Main {

	public static void main(String[] args) 
	{
		Pizzeria bella = new Pizzeria(new PizzaFactory());
		bella.orderPizza(PizzaFactory.PizzaType.SALAMI);
	}

}
