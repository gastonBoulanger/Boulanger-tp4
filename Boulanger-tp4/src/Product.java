
public class Product {
	private double weight;
	private double value;
	private String name;
	private double index;
	private int stock;

	public Product() {

	}

	public Product(String n, double p, double v, int stock) {
		this.name = n;
		this.weight = p;
		this.value = v;
		this.stock = stock;
		index = value / weight;
	}

	@Override
	public String toString() {
		return "[" + name + ", " + getWeight() + ", $" + getValue() + ", index w/v: " + getValue() / getWeight() + "]";
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public double getValue() {
		return value;
	}

	public double getIndex() {
		return index;
	}
	
	public double getStock() {
		return stock;
	}
	public boolean hasStock(){
		if(stock > 0){
			return true;
		}
		else return false;
	}
	public void substractStock(){
		stock--;
	}
}
