
public class PizzaFactory 
{
	public enum PizzaType{ BASIC, SALAMI, HAWAII};

	public Pizza createPizza( PizzaType type)
	{
		switch( type ){
 
		case SALAMI:
	       	return new SalamiPizza();
		case HAWAII:
	    	return new HawaiiPizza();
		default:
			return new Pizza();	
		}
	}
}