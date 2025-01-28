package pizza_Hunt;

public class OrderPlaced implements Orders {
int added = 0;
Pizza p = new Pizza();
	@Override
	public int addCheese() {
		System.out.println("Extra cheese added");
		added += p.getExtraCheese();
		return added;
	}

	@Override
	public int addToppings() {
		System.out.println("Extra cheese Toppings");
		added += p.getExtraToppings();
		return added;
	}

	@Override
	public double TotalAmount(int choice, double amount) {
		double total = 0;
		switch(choice) {
		case 1 :
			total = p.getPizza()+amount;
			break;
		case 2 :
			total = p.getChickenPizza()+amount;
			break;
		case 3 :
			total = p.getOnionPizza()+amount;
			break;
		case 4 :
			total = p.getTandooriChikenPizza()+amount;
			break;
		case 5:
			total = p.getDoubleCheesePizza()+amount;
			break;
		}	
		return total;
		
	}

}
