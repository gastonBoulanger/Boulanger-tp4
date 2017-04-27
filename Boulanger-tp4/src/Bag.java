import java.util.ArrayList;
import java.util.Collections;

public class Bag {
	private double capacity;
	private ArrayList<Product> products = new ArrayList<Product>();
	private ArrayList<Product> selectedProductList = new ArrayList<Product>();

	public Bag(double c) {
		this.capacity = c;
	}

	public void addProduct(Product p) {
		products.add(p);
	}
	//Metodo que selecciona los productos segun indice
	public ArrayList<Product> selectorProducts(ArrayList<Product> productList) {
		products = productList;
		//Se ordena la lista de productos segun indice
		Collections.sort(products, new ComparatorProduct());
		//Se recorre la lista ordenada de productos por indice
		for(Product p : products){
			//Mientras la bolsa disponga capacidad y haya stock se agrega
			while((p.getWeight() <= this.capacity) && p.hasStock()){
				selectedProductList.add(p);
				capacity -= p.getWeight();
				p.substractStock();
			}
			
		}
		return selectedProductList;
	}
	
	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
}
