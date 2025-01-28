package pizza_Hunt;

public class Pizza {
  
	private double pizza;
	private double chickenPizza;
	private double onionPizza;
	private double tandooriChikenPizza;
	private double doubleCheesePizza;
	private int extraCheese;
	private int extraToppings;
	public double getPizza() {
		return pizza;
	}
	public void setPizza(double pizza) {
		this.pizza = pizza;
	}
	public double getChickenPizza() {
		return chickenPizza;
	}
	public void setChickenPizza(double chickenPizza) {
		this.chickenPizza = chickenPizza;
	}
	public double getOnionPizza() {
		return onionPizza;
	}
	public void setOnionPizza(double onionPizza) {
		this.onionPizza = onionPizza;
	}
	public double getTandooriChikenPizza() {
		return tandooriChikenPizza;
	}
	public void setTandooriChikenPizza(double tandooriChikenPizza) {
		this.tandooriChikenPizza = tandooriChikenPizza;
	}
	public double getDoubleCheesePizza() {
		return doubleCheesePizza;
	}
	public void setDoubleCheesePizza(double doubleCheesePizza) {
		this.doubleCheesePizza = doubleCheesePizza;
	}
	public int getExtraCheese() {
		return extraCheese;
	}
	public void setExtraCheese(int extraCheese) {
		this.extraCheese = extraCheese;
	}
	public int getExtraToppings() {
		return extraToppings;
	}
	public void setExtraToppings(int extraToppings) {
		this.extraToppings = extraToppings;
	}
	public Pizza() {
		super();
		this.pizza = 150;
		this.chickenPizza = 200;
		this.onionPizza = 180;
		this.tandooriChikenPizza = 230;
		this.doubleCheesePizza = 190;
		this.extraCheese = 50;
		this.extraToppings = 50;
	}
	public String toString() {
	    return " 1. pizza = " + pizza + 
	           "\n 2. chickenPizza = " + chickenPizza + 
	           "\n 3. onionPizza = " + onionPizza + 
	           "\n 4. tandooriChickenPizza = " + tandooriChikenPizza + 
	           "\n 5. doubleCheesePizza = " + doubleCheesePizza + "\n";
	}
	
}
